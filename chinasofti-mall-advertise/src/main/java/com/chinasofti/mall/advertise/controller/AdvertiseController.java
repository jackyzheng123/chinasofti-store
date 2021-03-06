package com.chinasofti.mall.advertise.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.chinasofti.mall.advertise.service.IAdvertiseService;
import com.chinasofti.mall.common.controller.BaseController;
import com.chinasofti.mall.common.entity.AdvertiseContents;
import com.chinasofti.mall.common.entity.Message;

/**
 * 
 * @ClassName: AdvertiseController
 * @Description: 广告服务controller
 * @author KanM
 * @date 2017年11月1日 下午10:44:48
 * @version
 */
@RestController
@RequestMapping("advertise")
public class AdvertiseController implements BaseController<AdvertiseContents> {

	@Autowired
	IAdvertiseService advertiseService;

	@Override
	@RequestMapping("findAll")
	public List<AdvertiseContents> findAll() {
		return advertiseService.findAll();
	}

	@Override
	@RequestMapping("findById/{id}")
	public AdvertiseContents findById(@PathVariable String id) {
		return advertiseService.findById(id);
	}

	@Override
	@RequestMapping("deleteById/{id}")
	public String deleteById(@PathVariable String id) {
		advertiseService.deleteById(id);
		return "";
	}

	@Override
	@RequestMapping("update")
	public String update(AdvertiseContents t) {
		advertiseService.update(t);
		return "";
	}

	@Override
	@RequestMapping("add")
	public String add(AdvertiseContents t) {
		advertiseService.save(t);
		return "";
	}

	/**
	 * 
	 * @Title: findByPage
	 * @Description: 分页查询
	 * @param map
	 * @return: String
	 * @throws:
	 */
	@RequestMapping("findByPage")
	public String findByPage(@RequestParam Map<String, Object> map) {
		return advertiseService.findByPage(map);
	}

	// 判断更新或者添加
	@RequestMapping("addOrUpdate")
	public Message addOrUpdate(AdvertiseContents advertiseContents) {
		Message message = new Message();
		if (null != advertiseContents.getIds() && !advertiseContents.getIds().isEmpty()) {
			if (advertiseService.update(advertiseContents) <= 0) {
				message.setErrorMsg("更新失败");
			}

		} else {
			if (advertiseService.save(advertiseContents) <= 0) {
				message.setErrorMsg("添加失败");
			}
		}
		return message;
	}

	@RequestMapping("batchAdd")
	public void batchAdd() {
		AdvertiseContents t = new AdvertiseContents();
		for (int i = 1; i < 200; i++) {
			if (i % 2 == 0) {
				t.setTitle("测试广告" + i);
				t.setStates("1");
			} else {
				t.setTitle("分类广告" + i);
				t.setStates("0");
			}
			t.setIds(String.valueOf(i));
			t.setUrl("www.baidu.com" + i);
			t.setDescs(BigDecimal.valueOf(i));
			t.setContens("单广告" + i);
			t.setCategoryName("生鲜水果" + i);
			t.setImageurl("www.test.com" + i);
			t.setPositionName("首页");
			t.setBeginTime("2017-08-23 00:" + i);
			t.setEndTime("2017-08-24 00:" + i);
			advertiseService.save(t);
		}

	}

}

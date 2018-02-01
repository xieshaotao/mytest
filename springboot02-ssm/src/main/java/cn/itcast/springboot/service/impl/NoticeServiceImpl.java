package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	/**
	 * 分页查询
	 */
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		long count =noticeMapper.count();
		List<Notice> list = noticeMapper.findList(page, rows);
		//创建map封装信息
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("page", count);
		map.put("rows", list);
		
		return map;
	}

}

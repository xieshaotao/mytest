package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

public interface NoticeService {
	
	public List<Notice> findAll();

	public Map<String, Object> findByPage(Integer i, Integer rows);
}

package cn.itcast.springboot.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Controller
public class NoticeController {
	
	@Autowired
	public NoticeService noticeService;
	/**
	 * 查询所有
	 * @return
	 */
	@GetMapping("/findAll")
	@ResponseBody
	public List<Notice> findAll(){
		return noticeService.findAll();
	}
	
	@GetMapping("show")
	public String show() {
		return "notice.html";
	}
	/**
	 * 分页查询
	 * 
	 */
	@GetMapping("page")
	@ResponseBody
	public Map<String,Object> findByPage(@RequestParam(value="page",defaultValue="1",
							required=false)Integer page,@RequestParam(value="rows",
							defaultValue="10",required=false)Integer rows){
		
		return noticeService.findByPage((page-1)*rows,rows);
	}

}

package com.spring.web.controller.admin.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("adminNoticeController")
@RequestMapping("/admin/board/notice/")
public class NoticeController { 
   
	@RequestMapping("list")
	public String list() {
		
		return "";
	}
	
	@RequestMapping(value="reg", method= {RequestMethod.POST})
	@ResponseBody
	public String reg(String title, String content) {
		
		return String.format("title:%s<br> content:%s<br>", title, content);
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "";
	}
	
	@RequestMapping("del")
	public String del() {
		
		return "";
	}
	
	
}

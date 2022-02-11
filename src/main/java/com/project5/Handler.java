package com.project5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Handler {
	
	@GetMapping("/url")
	@ResponseBody
	public String show()
	{
		return "we are adding security in sts.";
	}
public static void main(String[] args) {
	new Handler().show();
}
}

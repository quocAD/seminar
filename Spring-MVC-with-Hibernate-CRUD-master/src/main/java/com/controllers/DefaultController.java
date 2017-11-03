package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/default")
public class DefaultController {
	@RequestMapping(value = "/*", method = { RequestMethod.GET })
	@ResponseBody
	public String fallback() {
		return "index";
	}

	@RequestMapping(value = "/abc", method = { RequestMethod.GET })
	@ResponseBody
	public String fallback2() {
		return "abc";
	}
}
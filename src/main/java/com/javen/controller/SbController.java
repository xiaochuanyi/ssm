package com.javen.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javen.service.SbService;

@Controller
@RequestMapping("/sb")
public class SbController {
	@Resource
	private SbService sbService;
@RequestMapping("/sb1")
public void test(){
	System.out.println(sbService.test());
	System.out.println(11111111);
}
}

package com.mycms.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;

import com.google.common.collect.Maps;


@Controller
public class BaseController {
	
	protected static Map<String,Object> logininfo = Maps.newHashMap();
	
	protected static final String USER_SESSION = "user_session";
	
}

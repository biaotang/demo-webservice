package com.macrowing.ws.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.macrowing.ws.service.LocationService;

@WebService
public class LocationServiceImpl implements LocationService {

	@WebMethod
	public String location(String name) {
		Map<String, String> userLoc = getAllUserLocation();
		String location = userLoc.get(name);
		return location == null ? "没找到\"".concat(name).concat("\"所在地") : location;
	}
	
	Map<String, String> getAllUserLocation(){
		Map<String, String> userLoc = new HashMap<String, String>();
		userLoc.put("张三", "北京市xxx");
		userLoc.put("李四", "上海市xxx");
		userLoc.put("王五", "深圳市xxx");
		userLoc.put("大胖", "南京市xxx");
		userLoc.put("二胖", "南京市xxx");
		userLoc.put("三胖", "南京市xxx");
		userLoc.put("小明", "上海市xxx");
		return userLoc;
	}
}

package com.macrowing;

import com.macrowing.ws.service.impl.LocationServiceImpl;
import com.macrowing.ws.service.impl.LocationServiceImplService;

public class LocationClient {
	public static void main(String[] args) {
		//获取到location服务
		LocationServiceImplService locFactory = new LocationServiceImplService();
		LocationServiceImpl locationServiceImpl = locFactory.getLocationServiceImplPort();
		String result = locationServiceImpl.location("张三");
		System.out.println("张三所在地：".concat(result));
		result = locationServiceImpl.location("李四");
		System.out.println("李四所在地：".concat(result));
		result = locationServiceImpl.location("皮皮虾");
		System.out.println("皮皮虾所在地：".concat(result));
	}
}

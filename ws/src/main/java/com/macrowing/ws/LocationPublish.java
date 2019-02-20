package com.macrowing.ws;

import javax.xml.ws.Endpoint;

import com.macrowing.ws.service.impl.LocationServiceImpl;

public class LocationPublish {
	public static void main(String[] args) {
		String address = "http://localhost:8888/location";
		Endpoint.publish(address, new LocationServiceImpl());
		System.out.println("Location发布成功!");
		
	}
}

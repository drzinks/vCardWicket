package com.drzinks.services;

import org.springframework.stereotype.Service;

import com.drzinks.services.interfaces.HelloWorldService;

@Service
public class HelloWorldServiceImpl implements HelloWorldService{
	public String getHelloWorldMessage(){
		return "Hello from server";
	}
	
}

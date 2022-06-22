package com.springbook.ioc.injection;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("applicationComtext.xml");
		
		CollectionBean bean = (CollectionBean)factory.getBean("collectionBean");
		List<String> addressList = bean.getAddressList();
		for(String address : addressList) {
			System.out.println(address);
		}
		System.out.println("=======================================");
		
		bean =(CollectionBean)factory.getBean("collectionBean");
		Set<String> addressSet = bean.getAddressSet();
		for(String address : addressSet) {
			System.out.println(address);
		}
		System.out.println("=======================================");
		
		Map<String, String> addressMap = bean.getAddressMap();
		for(Entry<String, String> address : addressMap.entrySet()) {
			System.out.println(address);
			
		}
		System.out.println("=======================================");

		Properties pro = bean.getAddressProperties();
		for(Entry<Object, Object> properties : pro.entrySet()) {
			System.out.println(properties);
		}
		
		factory.close();
	}

} 

package com.example;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Runner {
	/**
	 * class has to be managed by Spring to be able to inject
	 * Runner is not inside container, hence not managed by Spring
	 * It will ask the container
	 */
	
	public static void main (String[] args){
		//HelloMessage helloMessage = new HelloMessageEnglish();

		//locate your xml file within the classpath
		//BeanFactory beanFactory = new XmlBeanFactory(
		//		new ClassPathResource("applicationContext.xml"));
		
		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Casting can be any legal interfaces or super class
		//Spring objectiv: class is unaware of the exact implementation of the class
		//HelloMessage helloMessageEnglish = (HelloMessage) beanFactory.getBean("mr-bean");
		//HelloMessage helloMessageFrench = (HelloMessage) beanFactory.getBean("clousseau");
		//Chipmunk chipmunks = (Chipmunk) beanFactory.getBean("chipmunks");
		//Create a Chipmunks class that has a field List<String>
		//create the bean chipmunks that injects the list of chipmunts
		
		//System.out.println(helloMessageEnglish.getMessage());
		//System.out.println(helloMessageFrench.getMessage());
		
		//for (String chipmunk : chipmunks.getNames()) {
		//	System.out.println(chipmunk);
		//}
		
		//USStates usStates = (USStates) beanFactory.getBean("usStates");
		//System.out.println(usStates.getStateNames().get("VA"));
		
		
		//Map that contains <String, List<String>
		//MovieCharacter movieCharacter = (MovieCharacter) beanFactory.getBean("movie-character");
		//for(Map.Entry<String, List<String>> entry: movieCharacter.getCharacter().entrySet()) {
		//	System.out.println("Key: "+ entry.getKey());
		//	System.out.println("Values: "+entry.getValue());
		//}
		
		Configuration configuration =  (Configuration) applicationContext.getBean("chipmunk-from-config");
		System.out.println("chipmunk name is "+configuration.getChipmunkName());
		
	}

}

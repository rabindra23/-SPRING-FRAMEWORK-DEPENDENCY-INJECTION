package com.masai.app.task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appclass {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("application-context.xml");
		Collage coll=ctx.getBean(Collage.class,"winter");
		coll.showDetails();
		
		ClassPathXmlApplicationContext ctx2 = (ClassPathXmlApplicationContext)ctx;
		ctx2.close();

	}

}

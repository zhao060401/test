package com.jzq.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CDPlayerTest {
	private CompactDisc cd;
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("piopres.xml");
		CompactDisc compactDisc=ctx.getBean(CompactDisc.class);
		compactDisc.play();
	}

}

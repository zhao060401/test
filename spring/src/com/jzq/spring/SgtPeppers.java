package com.jzq.spring;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc{

	@Override
	public void play() {
		System.out.println("The play is reading");
		
	}

}

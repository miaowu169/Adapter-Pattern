package com.practice.Adaptee;

import com.practice.Domain.Hero;
/*
 * Adaptee类，包含客户想要实现的方法 
 */
public class LuBanQiHao extends Hero {
	public LuBanQiHao() {
		super.setHeroName("鲁班七号");
	}
	
	//客户想要实现的方法
	public void display() {
		System.out.println("鲁班：相信科学！");
	}

}

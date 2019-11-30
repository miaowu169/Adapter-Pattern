package com.practice.Adaptee;

import com.practice.Domain.Hero;
/*
 * Adaptee类，包含客户想要实现的方法
 */

public class HouYi extends Hero {
	public HouYi() {
		super.setHeroName("后羿");
	}
	
	//客户想要实现的方法
	public void display() {
		System.out.println("后羿:苏醒吧，猎杀时刻！");
	}

}

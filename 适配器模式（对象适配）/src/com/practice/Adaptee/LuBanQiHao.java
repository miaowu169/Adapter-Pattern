package com.practice.Adaptee;

import com.practice.Domain.Hero;
/*
 * Adaptee�࣬�����ͻ���Ҫʵ�ֵķ��� 
 */
public class LuBanQiHao extends Hero {
	public LuBanQiHao() {
		super.setHeroName("³���ߺ�");
	}
	
	//�ͻ���Ҫʵ�ֵķ���
	public void display() {
		System.out.println("³�ࣺ���ſ�ѧ��");
	}

}

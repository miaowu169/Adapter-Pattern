package com.practice.Adaptee;

import com.practice.Domain.Hero;
/*
 * Adaptee�࣬�����ͻ���Ҫʵ�ֵķ���
 */

public class HouYi extends Hero {
	public HouYi() {
		super.setHeroName("����");
	}
	
	//�ͻ���Ҫʵ�ֵķ���
	public void display() {
		System.out.println("����:���Ѱɣ���ɱʱ�̣�");
	}

}

package com.practice.Adapter;

import com.practice.Domain.Hero;
import com.practice.Target.ISkill;
/*
 * 	Adapter�࣬�Ѵ���Adaptee���󣬷�װ����ķ���
 */

public class Adapter implements ISkill {
	Hero hero = null;
	
	public Adapter(Hero hero) {
		this.hero = hero;
	}
	
	public void useSkill() {
		hero.display();
	}
}

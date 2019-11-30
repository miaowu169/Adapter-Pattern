package com.practice.Adapter;

import com.practice.Domain.Hero;
import com.practice.Target.ISkill;
/*
 * 	Adapter类，把传入Adaptee对象，封装对象的方法
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

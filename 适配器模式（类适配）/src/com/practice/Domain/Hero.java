package com.practice.Domain;

/*
 * Hero类
 * @heroName 英雄的名字
 */
public abstract class Hero {
	private String heroName;
	//英雄的自我介绍
	public abstract void display();
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
}

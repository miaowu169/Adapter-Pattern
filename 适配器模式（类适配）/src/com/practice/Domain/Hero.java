package com.practice.Domain;

/*
 * Hero��
 * @heroName Ӣ�۵�����
 */
public abstract class Hero {
	private String heroName;
	//Ӣ�۵����ҽ���
	public abstract void display();
	
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
}

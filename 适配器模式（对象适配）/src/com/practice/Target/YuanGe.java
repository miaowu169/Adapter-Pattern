package com.practice.Target;

import com.practice.Adapter.Adapter;
import com.practice.Domain.Hero;
/*
 * Ӣ��Ԫ���࣬����Target�ӿ�
 * @Hero heroName ���մ����Adaptee����
 */
public class YuanGe{
	Hero heroName;
	ISkill skill1 = null;
	
	public void setHero(Hero heroName) {
		this.heroName = heroName;
	}
	
	public void useSkill() throws Exception{
		//System.out.println(heroName.getHeroName());
		if(heroName.getHeroName().equalsIgnoreCase("����")) {
			System.out.print("[Ԫ��]");
			skill1=new Adapter(heroName); 
		}else if(heroName.getHeroName().equalsIgnoreCase("³���ߺ�")) {
			System.out.print("[Ԫ��]");
			skill1=new Adapter(heroName); 
		}else {
			throw new Exception();
		}
		
		skill1.useSkill();
	}
}

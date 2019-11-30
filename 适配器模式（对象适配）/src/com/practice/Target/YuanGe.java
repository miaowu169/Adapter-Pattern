package com.practice.Target;

import com.practice.Adapter.Adapter;
import com.practice.Domain.Hero;
/*
 * 英雄元歌类，持有Target接口
 * @Hero heroName 接收传入的Adaptee对象
 */
public class YuanGe{
	Hero heroName;
	ISkill skill1 = null;
	
	public void setHero(Hero heroName) {
		this.heroName = heroName;
	}
	
	public void useSkill() throws Exception{
		//System.out.println(heroName.getHeroName());
		if(heroName.getHeroName().equalsIgnoreCase("后羿")) {
			System.out.print("[元歌]");
			skill1=new Adapter(heroName); 
		}else if(heroName.getHeroName().equalsIgnoreCase("鲁班七号")) {
			System.out.print("[元歌]");
			skill1=new Adapter(heroName); 
		}else {
			throw new Exception();
		}
		
		skill1.useSkill();
	}
}

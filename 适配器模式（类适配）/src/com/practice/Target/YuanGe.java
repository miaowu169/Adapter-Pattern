package com.practice.Target;

import com.practice.Adapter.HouYiAdapter;
import com.practice.Adapter.LuBanQiHaoAdapter;

/*
 * 英雄元歌类，持有Target接口
 */

public class YuanGe{
	String heroName;
	ISkill skill1 = null;
	
	public void setHero(String heroName) {
		this.heroName = heroName;
	}
	
	//选择相应的适配器
	public void useSkill() throws Exception{
		//System.out.println(heroName.getHeroName());
		if(heroName.equalsIgnoreCase("HouYi")) {
			System.out.print("[元歌]");
			skill1=new HouYiAdapter(); 
		}else if(heroName.equalsIgnoreCase("LuBanQiHao")) {
			System.out.print("[元歌]");
			skill1=new LuBanQiHaoAdapter(); 
		}else {
			throw new Exception();
		}
		//使用适配器方法
		skill1.useSkill();
	}
}

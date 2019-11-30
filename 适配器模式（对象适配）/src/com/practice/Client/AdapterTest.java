package com.practice.Client;

import com.practice.Adaptee.HouYi;
import com.practice.Adaptee.LuBanQiHao;
import com.practice.Domain.Hero;
import com.practice.Target.YuanGe;

/*
 * 测试类Test
 */

public class AdapterTest {
	public static void main(String[] args) {
		//测试Adaptee类中的方法
		Hero HouYi = new HouYi();
		HouYi.display();
		Hero LuBan = new LuBanQiHao();
		LuBan.display();
		
		//创建英雄元歌
		YuanGe YuanGe = new YuanGe();

		try {
			//选择适配的英雄
			YuanGe.setHero(new LuBanQiHao());
			YuanGe.useSkill();
				
			//使用适配英雄的方法
			YuanGe.setHero(new HouYi());
			YuanGe.useSkill();
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
}

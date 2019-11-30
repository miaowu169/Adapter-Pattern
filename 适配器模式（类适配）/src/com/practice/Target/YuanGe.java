package com.practice.Target;

import com.practice.Adapter.HouYiAdapter;
import com.practice.Adapter.LuBanQiHaoAdapter;

/*
 * Ӣ��Ԫ���࣬����Target�ӿ�
 */

public class YuanGe{
	String heroName;
	ISkill skill1 = null;
	
	public void setHero(String heroName) {
		this.heroName = heroName;
	}
	
	//ѡ����Ӧ��������
	public void useSkill() throws Exception{
		//System.out.println(heroName.getHeroName());
		if(heroName.equalsIgnoreCase("HouYi")) {
			System.out.print("[Ԫ��]");
			skill1=new HouYiAdapter(); 
		}else if(heroName.equalsIgnoreCase("LuBanQiHao")) {
			System.out.print("[Ԫ��]");
			skill1=new LuBanQiHaoAdapter(); 
		}else {
			throw new Exception();
		}
		//ʹ������������
		skill1.useSkill();
	}
}

package com.practice.Client;

import com.practice.Domain.Hero;
import com.practice.Domain.HouYi;
import com.practice.Domain.LuBanQiHao;
import com.practice.Target.YuanGe;

/*
 * ������Test
 */

public class AdapterTest {
	public static void main(String[] args) {
		//����Adaptee���еķ���
		Hero HouYi = new HouYi();
		HouYi.display();
		Hero LuBan = new LuBanQiHao();
		LuBan.display();
		
		//����Ӣ��Ԫ��
		YuanGe YuanGe = new YuanGe();

		try {
			//ѡ�������Ӣ��
			YuanGe.setHero("HouYi");
			//ʹ������Ӣ�۵ķ���
			YuanGe.useSkill();
					
			YuanGe.setHero("LuBanQiHao");
			YuanGe.useSkill();
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
}

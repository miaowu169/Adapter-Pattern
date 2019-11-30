package com.practice.Client;

import com.practice.Adaptee.HouYi;
import com.practice.Adaptee.LuBanQiHao;
import com.practice.Domain.Hero;
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
			YuanGe.setHero(new LuBanQiHao());
			YuanGe.useSkill();
				
			//ʹ������Ӣ�۵ķ���
			YuanGe.setHero(new HouYi());
			YuanGe.useSkill();
		} catch (Exception e) {
			e.printStackTrace();
		}	

	}
}

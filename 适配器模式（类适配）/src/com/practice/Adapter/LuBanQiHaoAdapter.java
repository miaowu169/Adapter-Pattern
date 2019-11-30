package com.practice.Adapter;

import com.practice.Domain.LuBanQiHao;
import com.practice.Target.ISkill;

/*
 * Adapter类：实现接口继承LuBanQiHao类(以便调用LuBanQiHao类的相关方法)
 */

public class LuBanQiHaoAdapter extends LuBanQiHao implements ISkill {
	//实现接口的方法
	public void useSkill() {
		//调用Adaptee类中的目标方法
		display();
	}
}

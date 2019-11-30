package com.practice.Adapter;

import com.practice.Domain.HouYi;
import com.practice.Target.ISkill;

/*
 * Adapter类：实现接口继承HouYi类(以便调用HouYi类的相关方法)
 */

public class HouYiAdapter extends HouYi implements ISkill {
	//实现接口的方法
	public void useSkill() {
		//调用Adaptee类中的目标方法
		display();
	}
}

package com.practice.Adapter;

import com.practice.Domain.HouYi;
import com.practice.Target.ISkill;

/*
 * Adapter�ࣺʵ�ֽӿڼ̳�HouYi��(�Ա����HouYi�����ط���)
 */

public class HouYiAdapter extends HouYi implements ISkill {
	//ʵ�ֽӿڵķ���
	public void useSkill() {
		//����Adaptee���е�Ŀ�귽��
		display();
	}
}

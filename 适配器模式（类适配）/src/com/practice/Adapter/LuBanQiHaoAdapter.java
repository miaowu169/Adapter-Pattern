package com.practice.Adapter;

import com.practice.Domain.LuBanQiHao;
import com.practice.Target.ISkill;

/*
 * Adapter�ࣺʵ�ֽӿڼ̳�LuBanQiHao��(�Ա����LuBanQiHao�����ط���)
 */

public class LuBanQiHaoAdapter extends LuBanQiHao implements ISkill {
	//ʵ�ֽӿڵķ���
	public void useSkill() {
		//����Adaptee���е�Ŀ�귽��
		display();
	}
}

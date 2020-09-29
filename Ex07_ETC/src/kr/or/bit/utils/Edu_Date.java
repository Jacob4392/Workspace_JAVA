package kr.or.bit.utils;

import java.util.Calendar;

//���赵
//���ϰ� (���� ����ϴ� ���)
//static, �Լ��� ������(�ϳ��� �̸�����) -> �����ε�

public class Edu_Date {
	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR)+"��"+
				(date.get(Calendar.MONTH)+1)+"��"+
				date.get(Calendar.DATE)+"��";
	}
	
	public static String DateString(Calendar date, String opr) {
		return date.get(Calendar.YEAR)+opr+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
	}
	
	
	//�䱸����
	//2020-8-26
	//1~9�� >> 01,02 ... 09
	//10,11,12 >> �״�� ���
	
	public static String monthFormat_DateString(Calendar date) {
		
		if(date.get(Calendar.MONTH)+1 >=1 && date.get(Calendar.MONTH)+1<=9) {
			
		return date.get(Calendar.YEAR)+"��0"+
				(date.get(Calendar.MONTH)+1)+"��"+
				date.get(Calendar.DATE)+"��";
		}
		return date.get(Calendar.YEAR)+"��"+
				(date.get(Calendar.MONTH)+1)+"��"+
				date.get(Calendar.DATE)+"��";
	}
	
	public static String monthFormat_DateString(Calendar date,String opr) {
		
		if(date.get(Calendar.MONTH)+1 >=1 && date.get(Calendar.MONTH)+1<=9) {
			
		return date.get(Calendar.YEAR)+opr+"0"+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
		}
		return date.get(Calendar.YEAR)+opr+
				(date.get(Calendar.MONTH)+1)+opr+
				date.get(Calendar.DATE);
	}
	
}
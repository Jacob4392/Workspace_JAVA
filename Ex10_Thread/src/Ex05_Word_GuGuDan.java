import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JOptionPane;

/*
����
main �Լ� ������ Thread 2�� ����
1. �ð�(time) �����ϴ� Thread
2. �ܾ� �Է��� ó���ϴ� Thread

main �Լ� 2�� ����

�� �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϼ���
hint) �����ڿ� (static)

Thread : �������� 

join : �ٸ� �������� ���Ḧ ��ٸ� (�ްԽǿ���)

�پ��� ��� �۾� ... �� �༺�� �Ÿ��� ���ؼ�  ... �� �ջ��� ��� ...
10 ��   ... 1��  ... �ջ� 

main �����忡�� join �ɾ .... ��޷� ... WordInputProcess , WordTimeOut 
*/
class WordInputProcess extends Thread{
	@Override
	public void run() {
		
		while(true) {
			String dan="2";
			String inputdata = JOptionPane.showInputDialog("dan" + "�� ���� �Է�");
			if(inputdata != null && !inputdata.equals("")) {
				Ex05_Word_GuGuDan.inputcheck = true; //���� ����
			}
			System.out.println("�Է��� ����: " + inputdata);
		}

		//hint_1 : HashMap ������ ����� 
				HashMap<String, Integer> gugudan = new HashMap<String, Integer>();
				
				for(int i = 0 ; i < 5 ; i++) {
					int num1 = (int)(Math.random()*9)+1;
					int num2 = (int)(Math.random()*9)+1;
					gugudan.put(num1+"*"+num2, num1*num2);
				}
				
//				for(Map.Entry m : gugudan.entrySet()) {
//					System.out.println(m.getKey() + "/" +m.getValue());
//				}
				
				
				//hint_3
				//ó�� ��� (���� , ����ڰ� �Է��� �� , ����) ����
				//class QuizInfo 
				ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
				
				
				//hint_2
				//gugudan  ������  �� ���ϱ� (���� .... �䰪 �ޱ�)
				Set keys = gugudan.keySet();
				Object[] keylist = keys.toArray();
				int answer=0;
				for(int i = 0 ; i < keylist.length ; i++) {
				    answer = Integer.parseInt(JOptionPane.showInputDialog((String)keylist[i]));
				    System.out.println("������ ��"+answer);
				    if(gugudan.get(keylist[i])==answer) {
				    	System.out.println("����");
				    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "O"));
				    }else {
				    	System.out.println("����");
				    	QuizUserInfo.add(new QuizInfo((String)keylist[i], answer, "X"));
				    }
				}
				
				for(int i = 0 ; i < QuizUserInfo.size() ; i++) {
					System.out.println(QuizUserInfo.get(i).toString());
				}
		
	}
}


class WordTimeOut extends Thread{
	@Override
	public void run() {
		for(int i=10; i > 0 ; i--) {
			
			if(Ex05_Word_GuGuDan.inputcheck)return; //run�Լ� Ż��
			
			System.out.println("���� �ð�: " + i+"��");
			try {
				 Thread.sleep(1000); //���ǿ��� 1�ʰ� ������ ....
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class QuizInfo3{
	String keylist;
	int answer;
	String check;
	
	
	public QuizInfo3(String keylist, int answer, String check) {
		super();
		this.keylist = keylist;
		this.answer = answer;
		this.check = check;
	}


	@Override
	public String toString() {
		return "[����]: " + keylist + " [������ ��]: " + answer + " [���]: " + check;
	}
	
	
	
}

//Quiz �� ���� ���� (���� , �Է��� �� , ��� )
class QuizInfo4 {
    String question;
    int answer;
    String result;
    
    public QuizInfo4(String question, int answer, String result) {
        this.question = question;
        this.answer = answer;
        this.result = result;
    }
    
    public String toString() {
        return "����:"+this.question+" ����:"+this.answer+" ä��:"+this.result;
    }
}

public class Ex05_Word_GuGuDan {
	
	static boolean inputcheck= false;
	ArrayList<QuizInfo> QuizUserInfo = new ArrayList<QuizInfo>();
	
	public static void main(String[] args) {
		WordInputProcess word = new WordInputProcess();
		WordTimeOut time = new WordTimeOut();
			
		word.start();
		time.start();
		
		

		

		
		
		try {
			word.join(); //main ���� word ���������� ��޷� ..
			time.join(); //main ���� time ���������� ��޷� ..
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//���� Ȯ��
		System.out.println("Main END");

	}

}
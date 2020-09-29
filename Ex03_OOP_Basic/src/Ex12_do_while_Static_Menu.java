import java.util.Scanner;

public class Ex12_do_while_Static_Menu {
	//��� ... �Ϲ� ... ���� (����, ���� , ��ǰ(����:Ŭ����))
	static Scanner sc = new Scanner(System.in); //��ǰ(����:Ŭ����)
	
	//static Ȱ���� ���ɸ޴� �����ϱ� ���α׷� �ۼ�
	
	static int food;
	static String total="";

	
	//���
	static void inputRecord() {
		System.out.println("���ɸ޴� �Է�(1����Ʈ,2����Ʈ,3����Ʈ): ");
		food = Integer.parseInt(sc.nextLine());
		total+= food;
		switch(food) {
		case 1: total+= ","; break;
		case 2: total+= ","; break;
		case 3: total+= ","; break;
		}
		System.out.println("���ɸ޴�: " + food+"�� ��Ʈ");
	}
	static void deleteRecord() {
		total ="";
		System.out.println("���ɸ޴�: ");
	}
	static void sortRecord() {
		System.out.println("���ɸ޴� Ȯ��: "+ total + "�� �޴�");
	}
	
	
	static int displayMenu() {
		System.out.println("**************************");
		System.out.println("****���ɸ޴� �����ϱ� ���α׷�****");
		System.out.println("1. ���ɸ޴� �Է��ϱ�");
		System.out.println();
		System.out.println("2. ���ɸ޴� �����ϱ�");
		System.out.println();
		System.out.println("3. ���ɸ޴� Ȯ���ϱ�");
		System.out.println();
		System.out.println("4. ���α׷� ����");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while Ż�� (1<= menu <=4)
						}else {
							//1���� �۰ų� 4���� ū ���� .. ���α׷����� ���� (x)
							//���� ���� ���ڴ� (���� ����� ����)
							//System.out.println("�߸� �Է� �ϼ̽��ϴ�");
							throw new Exception("�޴� ���� ��ȣ�� �߸� �Ǿ����ϴ�");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("�޴� ���� ���� �߻�");
				  System.out.println("�޴� 1~4������ �Է�");
			  }
		}while(true);
		//���� : ����ڰ� 1 ~ 4���� ��ȣ�߿��� �ϳ��� ����
		return menu;
	}
	
	public static void main(String[] args) {
		//Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		
		while(true) {
			switch (displayMenu()) {
			case 1 : inputRecord();
				break;
			case 2 : deleteRecord();
				break;
			case 3 : sortRecord();
				break;
			case 4 : System.out.println("���α׷� ����");
					 //return;  //main ����
					 System.exit(0); //���α׷� ���� ����
			}
		}
	}

}









import java.util.Scanner;

public class Ex11_do_while_Menu {
	//상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	Scanner sc = new Scanner(System.in); //부품(참조:클래스)
	
	//기능
	void inputRecord() {
		System.out.println("성적데이터 입력 :");
	}
	void deleteRecord() {
		System.out.println("성적데이터 삭제 :");
	}
	void sortRecord() {
		  Scanner in = new Scanner(System.in);
	      double a, b, c = 0.0;
	      System.out.print("첫번째 숫자를 입력하세요. \n");
	      a = in.nextDouble();
	      System.out.print("두번째 숫자를 입력하세요.  \n");
	      b = in.nextDouble();
	      System.out.print("어떻게 계산 하실건가요?  " +
	            "\n1.더하기" +
	      		"\n2.빼기" +
	      		"\n3.곱하기" +
	      		"\n4.나누기" +
	    		"\n#" + "계산방식을 선택하세요. \n");
	      		
	      double somethin = in.nextDouble();
	      double addition = 1;
	      double subtraction = 2;
	      double multiplication = 3;
	      double division = 4;
	      if (somethin == addition) {
	      	c = a + b;
	      	System.out.println(a + " + " + b + " = " + c);  }
	      else if (somethin == subtraction)  {
	      	c = a - b;
	      	System.out.println(a + " - " + b + " = " + c);	}
	      else if (somethin == multiplication)	{
	      	c = a * b;
	      	System.out.println(a + " * " + b + " = " + c);	}
	      else if (somethin == division)   {
	      	c = a / b;
	      	System.out.println(a + " / " + b + " = " + c);	}
	}
	
	
	
	
	int displayMenu() {
		System.out.println("***************");
		System.out.println("****성적 관리****");
		System.out.println("1. 학생성적 입력하기");
		System.out.println();
		System.out.println("2. 학생성적 삭제하기");
		System.out.println();
		System.out.println("3. 학생성적 이름순 정렬하기");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine());
						if(menu >= 1 && menu <= 4) {
							break; //while 탈출 (1<= menu <=4)
						}else {
							//1보다 작거나 4보다 큰 값값 .. 프로그램적인 오류 (x)
							//나는 오류 보겠다 (오류 사용자 강제)
							//System.out.println("잘못 입력 하셨습니다");
							throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~4번까지 입력");
			  }
		}while(true);
		//실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
		return menu;
	}
	
	public static void main(String[] args) {
		Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		
		while(true) {
			switch (ex11.displayMenu()) {
			case 1 : ex11.inputRecord();
				break;
			case 2 : ex11.deleteRecord();
				break;
			case 3 : ex11.sortRecord();
				break;
			case 4 : System.out.println("프로그램 종료");
					 //return;  //main 종료
					 System.exit(0); //프로그램 강제 종료 (kill)
			}
		}
	}

}










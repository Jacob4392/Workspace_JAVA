
public class Ex02_Array_Quiz {

	public static void main(String[] args) {
		//수학과 학생들의 기말고사 시험점수
		int[] score = new int[] {79,88,97,54,56,95};
		int max = score[0]; //max 변수 >>79
		int min = score[0]; //min 변수 >>79
		
		
		/* Quiz
		 제어문을 사용해서 max라는 변수에 시험점수 최대값을,
		 min이라는 변수에 시험점수 최소값을 담으세요.
		 출력결과 : max > 97, min > 54
		 단, for문을 한 번만 쓰세요.(max, min 값을 하나의 for문에서 다 구하세요)		 
		 */
		
		for(int i=0;i<score.length;i++) {
			//System.out.println(score[i]);
			//if(score[i]>max) {max = score[i];}
			//if(score[i]<min) {min = score[i];}
			max = (score[i]>max)? score[i]:max;
			min = (score[i]<min)? score[i]:min;
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
		
		int[] number = new int[10];
		//10개의 방의 값을 1~10까지 값으로 초기화하라
		for(int i=0;i<number.length;i++) {
			number[i] = i+1;
		}
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]);
		}
	
		
		
		//어느 학생의 기말고사 시험점수(5과목)
		int sum=0;
		float average = 0f;
		int[] jumsu = {100,55,90,60,78};
		
		//1.총과목의 수
		//2.과목의 합
		//3.과목의 평균
		//단 2,3,번 문제는 하나의 for문으로 해결하세요.
		
		System.out.println("총과목의 수: "+jumsu.length);
		
		for(int i=0;i<jumsu.length;i++) {
			sum += jumsu[i];
			if(i == jumsu.length-1) { //마지막 방 번호와 같으면
				average = sum / (float)jumsu.length;
			}
		}
		System.out.println("과목의 합: "+sum);
		System.out.println("과목의 평균: "+average);
		System.out.printf("총 과목수:[%d], 총점:[%d], 평균:[%f]",jumsu.length, sum, average);
	}

}

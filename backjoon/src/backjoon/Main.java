package backjoon;


import java.util.Arrays;
import java.util.Scanner;

//Test Commit
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// �л� ��� ����
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		String arScores[] = new String[num];		
//		
//		for (int i = 0; i < arScores.length; i++) {
//			arScores[i]=sc.nextLine(); // �� �پ� �л��� , �л� ���� �Է�
//			String[] strScore = arScores[i].split(" "); // ���� �������� �߶� �迭 ����
//			int sum=0;
//			float avg = 0;
//			for (int j = 0; j < strScore.length; j++) {
//				if(j>=1) {
//					sum+=Integer.parseInt(strScore[j]);
//				}
//				avg=(float)sum/(Integer.parseInt(strScore[0]));	//�л� ����
//			}
//			int cnt=0;
//			float stuAvg=0;
//			for (int j = 0; j < strScore.length; j++) {
//				if(j>=1) {
//					if(Integer.parseInt(strScore[j])>avg) {
//						cnt++;
//					}
//				}
//				stuAvg=(float)cnt/(Integer.parseInt(strScore[0]))*100;
//			}
//			System.out.printf("%.3f%s\n",stuAvg,'%');
//		}
		
		// OX����
//		int num = sc.nextInt();
//		String arQuiz[]= new String [num];	
//
//		for (int i = 0; i < arQuiz.length; i++) {
//			arQuiz[i]=sc.next();
//			int score=0;
//			int cnt=0;
//			for (int j = 0; j < arQuiz[i].length(); j++) {
//				if(arQuiz[i].charAt(j)=='O') {
//					cnt++;
//					score+=cnt;
//				}else {
//					cnt=0;
//				}
//			}
//			System.out.println(score);			
//		}

		// 1546 ���
//		int score = sc.nextInt();
//		int scores[] = new int[score];		
//		float newScores[]= new float [score];
//		
//		for (int i = 0; i < scores.length; i++) {
//			scores[i]=sc.nextInt();
//
//		}
//		Arrays.parallelSort(scores);
//
//		float max = scores[scores.length-1];
//		float sum=0;
//		
//		for (int i = 0; i < score; i++) {
//
//			newScores[i]=((scores[i]/max))*100;
//			sum+=newScores[i];
//		}
//
//		System.out.println(sum/score);
		
		// ������ ����
//		int num[] = new int[10];
//		int numDiv[] = new int[10];
//		int result[] = new int[42];
//		int cnt=0;
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i]=sc.nextInt();
//		}
//		for (int i = 0; i < num.length; i++) { // numDiv�� num%42 ���� 
//			numDiv[i]=num[i]%42;
//			result[numDiv[i]]++;
//		}
//		
//		// �ߺ��� ã�ƺ���...^^...
//		// result[] �ȿ� 0�� �ƴѰ��� ���� ���ϱ�.... >> result �� �迭 ���� - 0�� ����
//		// �ƴϸ� ����for������ ������ �ߺ����� ������ cnt++ �ϰ� result�迭���� - �ߺ�����...........
//				
//		for (int i = 0; i < result.length; i++) {
//			if(result[i]>=1) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
		
		// ������ ���� 
//		int a,b,c;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		int mul = a*b*c;
//		
//		String Smul = ""+mul;
//		
//		int res [] = new int[10];
//		for (int i = 0; i < Smul.length(); i++) {
//			res[Integer.parseInt(String.valueOf(Smul.charAt(i)))]++;
//		}
//		for (int i = 0; i < res.length; i++) {
//			System.out.println(res[i]);
//		}
		
		// �ִ� ����~~
//		int arnum[] = new int [9];
//		for (int i = 0; i < arnum.length; i++) {
//			arnum[i]=sc.nextInt();
//		}
//
//		int maxnum[] = new int[9];		
//		for (int i = 0; i < maxnum.length; i++) {
//			maxnum[i]=arnum[i];
//		}
//		Arrays.sort(maxnum);
//		int maxNum = maxnum[maxnum.length-1];
//		
//		int index=0;
//		for (int i = 0; i < arnum.length; i++) {
//			if(maxNum==arnum[i]) {
//				index=i;
//			}
//		}
//		System.out.println(maxNum+"\n"+(index+1));
		
		
		
		
		
//		int h,m,c,n;
//		h = sc.nextInt();
//		m = sc.nextInt();
//		c = sc.nextInt();
//		
		// ����~~
//		n=(h*60+m+c)/60;	
//
//		System.out.println(n%24 + " " +(m+c)%60);
		
//		if(h==23) {
//			if(m+c<60) {
//				System.out.println(h+" "+(m+c));
//
//			}else if(m+c>=60) {
//				if((m+c)/60==1) {
//					h=0;
//				}else {
//					h=((m+c)/60)-1;
//				}
//				m=(m+c)%60;
//				System.out.println(h+" "+m);
//			}			
//		}else {
//			if(m+c<60) {
//				System.out.println(h+" "+(m+c));
//			}else if(m+c>=60) {
//				h+=(m+c)/60;
//				m=(m+c)%60;
//				System.out.println(h+" "+m);
//			}else if(m+c<60) {
//				System.out.println(h+" "+(m+c));
//			}	
//		}
		
		// ����~~
//		int dice[] = new int[3];
//		
//		for(int i=0; i<dice.length; i++) {
//			dice[i]=sc.nextInt();
//		}
//		
//		for(int i=0; i<dice.length; i++) { // dice �迭 �ȿ� ū ���ڴ�� ��ġ
//			for (int j = 0; j < dice.length; j++) {
//				if(dice[i]>dice[j]) {
//					int temp = dice[i];
//					dice[i]=dice[j];
//					dice[j]=temp;
//				}
//			}
//		}
//		
//		if(dice[0]==dice[1] && dice[1]==dice[2]) {
//			System.out.println(10000+dice[0]*1000);
//		}else if(dice[0]!=dice[1] && dice[1]!=dice[2]&&dice[2]!=dice[0]) {
//			System.out.println(dice[0]*100);
//		}else {
//			if(dice[0]==dice[1]) {
//				System.out.println(1000+dice[0]*100);
//			}else if(dice[1]==dice[2]) {
//				System.out.println(1000+dice[1]*100);
//			}
//		}
		
		//�ּ��ִ�
		// �ƾƾƾƾƤ��� �ð��ʰ�
		// ����!
//		int num = sc.nextInt();
//		int arnum [] = new int [num]; 
//		for (int i = 0; i < arnum.length; i++) {
//			arnum[i]=sc.nextInt();
//		}
//		Arrays.sort(arnum);
//		System.out.println(arnum[0]+" "+arnum[num-1]);
		
		//����~~
//		int num=sc.nextInt();
//		int startNum=num;
//		int cnt=0;		
//		while(true) {
//			num=(num%10*10)+(num/10+num%10)%10;
//			cnt++;
//			if(num==startNum) {
//				System.out.println(cnt);
//				break;
//			}
//		}	
		
		
//		if(num>=10) {
//			while(num!=temp) {
//				newNum=(num%10*10)+(num/10+num%10);
//				temp=newNum;		
//				count++;
//				if(temp>=10) {
//					newNum=(num%10*10)+(num/10+num%10);
//					temp=newNum;					
//					count++;
//				}else if(temp<10) {
//					newNum=(num*10)+num;
//					temp=newNum;
//					count++;
//				}
//			}
////			System.out.println(count);
//		}else if(num<10) {
//			while(num!=temp) {
//				newNum=(num*10)+num;
//				temp=newNum;
//				count++;
//				if(temp>=10) {
//					newNum=(num%10*10)+(num/10+num%10);
//					temp=newNum;					
//					count++;
//				}else if(temp<10) {
//					newNum=(num*10)+num;
//					temp=newNum;
//					count++;
//				}
//			}
//		}
//		System.out.println(count);	
		
		
		
		
	}//main
}

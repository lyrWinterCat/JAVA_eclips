package backjoon;


import java.util.Arrays;
import java.util.Scanner;

//Test Commit
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 학생 평균 문제
//		int num = sc.nextInt();
//		sc.nextLine();
//		
//		String arScores[] = new String[num];		
//		
//		for (int i = 0; i < arScores.length; i++) {
//			arScores[i]=sc.nextLine(); // 한 줄씩 학생수 , 학생 점수 입력
//			String[] strScore = arScores[i].split(" "); // 공백 기준으로 잘라서 배열 생성
//			int sum=0;
//			float avg = 0;
//			for (int j = 0; j < strScore.length; j++) {
//				if(j>=1) {
//					sum+=Integer.parseInt(strScore[j]);
//				}
//				avg=(float)sum/(Integer.parseInt(strScore[0]));	//학생 점수
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
		
		// OX퀴즈
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

		// 1546 평균
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
		
		// 나머지 개수
//		int num[] = new int[10];
//		int numDiv[] = new int[10];
//		int result[] = new int[42];
//		int cnt=0;
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i]=sc.nextInt();
//		}
//		for (int i = 0; i < num.length; i++) { // numDiv에 num%42 저장 
//			numDiv[i]=num[i]%42;
//			result[numDiv[i]]++;
//		}
//		
//		// 중복값 찾아볼까...^^...
//		// result[] 안에 0이 아닌값의 개수 구하기.... >> result 총 배열 길이 - 0의 개수
//		// 아니면 이중for문으로 돌려서 중복값이 나오면 cnt++ 하고 result배열길이 - 중복개수...........
//				
//		for (int i = 0; i < result.length; i++) {
//			if(result[i]>=1) {
//				cnt++;
//			}
//		}
//		
//		System.out.println(cnt);
		
		// 숫자의 개수 
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
		
		// 최댓값 정답~~
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
		// 정답~~
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
		
		// 정답~~
//		int dice[] = new int[3];
//		
//		for(int i=0; i<dice.length; i++) {
//			dice[i]=sc.nextInt();
//		}
//		
//		for(int i=0; i<dice.length; i++) { // dice 배열 안에 큰 숫자대로 배치
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
		
		//최소최대
		// 아아아아아ㅏㄱ 시간초과
		// 정답!
//		int num = sc.nextInt();
//		int arnum [] = new int [num]; 
//		for (int i = 0; i < arnum.length; i++) {
//			arnum[i]=sc.nextInt();
//		}
//		Arrays.sort(arnum);
//		System.out.println(arnum[0]+" "+arnum[num-1]);
		
		//정답~~
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

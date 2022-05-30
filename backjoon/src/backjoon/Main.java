package backjoon;


import java.util.Arrays;
import java.util.Scanner;
public class Main {

// 백준 함수
//    public static int NextNum(int num){
//        int result=num;
//        while(true){
//            result+=num%10;
//            if(num<10) break;
//            num/=10;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] numList=new int[NextNum(9999)+1];
//        for(int i=0;i<=10001;i++){
//            numList[NextNum(i)]++;
//        }
//        for(int i=0;i<=10001;i++){
//            if(numList[i]==0){
//                System.out.println(i);
//            }
//        }
//    }

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);			
		
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



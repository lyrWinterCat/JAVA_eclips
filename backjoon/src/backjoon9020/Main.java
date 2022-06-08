package backjoon9020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int k = 0; k < n; k++) {
			List<Integer> sNum=new ArrayList<>();
			int num=sc.nextInt();

			//num보다 작은 소수 배열에 저장
			int [] arrInt = new int[num+1];
			int i,j;
			for (i=0; i<=num; i++) arrInt[i]=0; arrInt[1]=1;
			for (i=2; i<=num; i++) {
				for(j=2; i*j<=num; j++) {
					arrInt[i*j]=1;
				}
			}
			
			for(i=2; i<=num; i++) {
				if(arrInt[i]!=1) sNum.add(i);
			}	
			
			System.out.println(sNum);
			
			//파티션 구하기
			int a=0;
			int b=0;
//			for (int m = 0; m <sNum.size(); m++) {
//				if(sNum.get(m)>=num/2 && sNum.contains(sNum.get(m))){
//					b=sNum.get(m);
//					a=num-b;
//				}
//			}
			//for 문 다시생각하기
			
			if(a>b) {
				System.out.println(b+" "+a);				
			} else if(b>a) {
				System.out.println(a+" "+b);
			} else if(b==a){
				System.out.println(b+" "+a);
			}
			
		}//for
	}
}

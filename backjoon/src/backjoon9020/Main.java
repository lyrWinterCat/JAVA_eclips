package backjoon9020;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//		List<Integer> sNum=ArrayList<Integer>(); 
//		
//		int[] arrInt=new int[10001];
//		int i,j;
//		for(i=0; i<=10000; i++) arrInt[i]=0; arrInt[1]=1;
//		for(i=2; i<=10000; i++) {
//			for(j=2; i*j<=10000; j++) {
//				arrInt[i*j]=1;
//			}
//		}
//		
//		for (i=2; i<=10000; i++) {
//			if(arrInt[i]!=1 ) sNum.add(arrInt[i]);
//		}		
//		
//		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int k = 0; k < n; k++) {
			List<Integer> sNum=new ArrayList<>();
			int num=sc.nextInt();
			//입력한 수보다 작은 소수들
			// 소수들의 합이 num이 되면 됨
			for (int i = 2; i < num; i++) {
				boolean isCheck=false;
				for (int j = 2; j < i; j++) {
					if(i%j==0) {
						isCheck=true;
					}
				}
				if(!isCheck) {
					sNum.add(i);
				}
			}//소수for
			System.out.println(sNum); 
			int a=0;
			int b=0;
			
			for (int i = 0; i < sNum.size(); i++) {
				if(sNum.contains(num-sNum.get(i))){
					a=sNum.get(i);
					b=num-a;
				}
			}
			System.out.println(a+" "+b);
			
			//...?? 두 소수가 가장 작은걸...어케만들지?
			
			
			
			
		}//for
		
	}

}

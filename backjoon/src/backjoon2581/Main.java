package backjoon2581;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		List<Integer> nList=new ArrayList<>();	
		
		for (int i = m; i <=n; i++) {
			boolean isCheck=false;
			
			for (int j = 2; j < i; j++) {
				if(i%j==0) {
					isCheck=true;
					break;
				}
			}
			if(!isCheck && i!=1) {
				nList.add(i);
			}
		}
		
		
		if(nList.size()!=0) {	
//			System.out.println(nList);
			int sum=nList.parallelStream().mapToInt(Integer::intValue).sum();
			int min=Collections.min(nList);
			System.out.println(sum);
			System.out.println(min);
		}else {
			System.out.println(-1);
		}		
	}
}

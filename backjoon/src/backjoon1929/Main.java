package backjoon1929;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		//에라토스테네스의 체
		int [] arrInt = new int[n+1];
		int i,j;
		
		for (i=0; i<=n; i++) arrInt[i]=0; arrInt[1]=1;
		
		for (i=2; i<=n; i++) {
			for (j=2; i*j<=n; j++) {
				arrInt[i*j]=1;
			}
		}
		
		for(i=m; i<=n; i++) {
			if(arrInt[i]!=1) System.out.println(i);
		}

	}
}

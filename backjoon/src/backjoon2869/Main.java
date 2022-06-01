package backjoon2869;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringTokenizer st = new StringTokenizer(s);
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int hight = Integer.parseInt(st.nextToken());		
		
		long day=(hight-down)/(up-down);
		
		if((hight-down)%(up-down)!=0) {
			day++;
			System.out.println(day);
		}else {
			System.out.println(day);
		}
	}
}

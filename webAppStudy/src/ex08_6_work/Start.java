package ex08_6_work;

import java.util.Random;

public class Start {
	private int rnd = new Random().nextInt(50)+1;
	int cnt=0;	
	
	public int getRnd() {
		return rnd;
	}
	public void setRnd(int rnd) {
		this.rnd = rnd;
	}
	public void upDown(int num) {		
		if(rnd < num) {
			cnt++;
			System.out.println("Down!");
		}else if(rnd>num) {
			cnt++;
			System.out.println("Up!");
		}else {
			System.out.println("�����Դϴ�!");
			System.out.println("�� �õ��� Ƚ�� : "+(cnt+1));
		}
	}

}

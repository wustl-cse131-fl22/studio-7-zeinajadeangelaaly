package studio7;

import java.util.Scanner;

public class Die {

	private int sideNum = 0;
	private int rollNum = 0;
	
	public Die() {
		sideNum = 0;
		rollNum = 0;
	}
	
	public Die(int sideNum, int rollNum) {
		sideNum = 0;
		rollNum = 0;
	}
	
	public void setDie(int sideNum, int newRoll) {
		rollNum = (int) (Math.random()* sideNum + 1);
	}
	
	public int getRoll() {
		return rollNum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Number of sides?");
		int n = in.nextInt();
		Die rollIns = new Die();
		rollIns.setDie(n, 0);
		System.out.println(rollIns.getRoll());
	}

}

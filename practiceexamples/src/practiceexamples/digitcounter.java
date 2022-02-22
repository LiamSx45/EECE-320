package practiceexamples;

import java.util.Scanner;

public class digitcounter {
	private int num;
	
	public void setNum(int x) {
		num = x;
	}
	
	public int getNum() {
		return num;
	}
	
	public int countDigits() {
		int n, count;
		n=num;
		count=0;
		while (n>=1){
			n/=10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		digitcounter dig = new digitcounter();
		int n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter a postive Integer Value: ");
		n=sc.nextInt();
		
		dig.setNum(n);
		System.out.println("Total number of digits in " + dig.getNum() + " are: " + dig.countDigits());
		

	}

}

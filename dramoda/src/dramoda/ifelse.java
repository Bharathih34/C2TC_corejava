package dramoda;

import java.util.Random;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand =new Random();
		int i =rand.nextInt(10);
		int j =rand.nextInt(100);
		System.out.println("i = "+ i);
		System.out.println("j=" + j);
		System.out.println(((i<10) ||(j<10)));

	}

}

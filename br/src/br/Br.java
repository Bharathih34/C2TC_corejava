package br;
class Cricketer{
	String name="Kohli";
	int age=30;
	String color="white";
	String role="batsman";
	String national="Indian";
	void Display()
	{
		System.out.println("I love cricket");
	}
		
			
}
public class Br {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method started");
Cricketer c = new Cricketer();
c.Display();
System.out.println("main method ended");
	}

}

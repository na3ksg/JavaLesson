package Lesson6;
public class DrawGraph1 {
	public static void main(String[] args) {
		// TODO code application logic here
		for (int i = 0; i < 10; i++) {
			System.out.println(i + ":");
			for (int j = 1; j < i * i; j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
	}
	
}

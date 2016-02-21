package Lesson7;
public class Graph2 {
	public static void main(String[] args) {
		// TODO code application logic here
		int i = 0;
		while (i < 10) {
			int j = 0;
			while (j < i * i) {
				System.out.println("*");
				j++;
			}
			System.out.println("");
			i++;
		}
	}
	
}

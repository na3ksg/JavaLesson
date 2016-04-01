package Lesson15;
public class GcTest1 {
	public static void main(String[] args) {
		// TODO code application logic here
		while(true) {
			String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			System.out.println("残りメモリ＝" + Runtime.getRuntime().freeMemory());
		}
	}
	
}

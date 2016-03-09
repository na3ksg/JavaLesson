package Lesson13;
public class NumberTest {
	public static void main(String[] args) {
		// TODO code application logic here
		try {
			String numstr = "XYZ";
			int val = Integer.parseInt(numstr);
			System.out.println("Val =" + val);
		} catch(NumberFormatException e) {
			System.out.println("例外：" + e);
		}
	}
	
}

package Lesson13;
public class ExceptionTest1 {
	public static void main(String[] args) {
		// TODO code application logic here
		int[] myarray = new int [3];
		try {
		System.out.println("代入するよ");
		myarray[100] = 0;
		System.out.println("代入したよ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("だいにゅうできなかったよ");
			System.out.println("例外は" + e + "だよ");
		}
		System.out.println("終了するよ");

	}
	
}

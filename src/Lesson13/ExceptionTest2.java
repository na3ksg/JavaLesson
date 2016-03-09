package Lesson13;
public class ExceptionTest2 {
	public static void main(String[] args) {
		// TODO code application logic here
		int[] myarray = new int[3];
		try {
			System.out.println("代入するよ");
			myAssign(myarray, 100, 0);
			System.out.println("代入したよ");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("代入できなかったよ");
			System.out.println("例外は" + e + "だよ");
		}
		System.out.println("終了するよ");
	}
	static void myAssign(int[] arr, int index, int value) {
		System.out.println("myAssignに来たよ");
		arr[index] = value;
		System.out.println("myAssignから帰るよ");
	}
	
}

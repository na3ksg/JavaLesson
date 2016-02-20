package Lesson5;
import java.io.*;
public class WeekArray {
	public static void main(String[] args) {
		// todo code application logic here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("0～6の数字を入力してね。対応した曜日を表示するよ！");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			switch (n) {
				case 0:
					System.out.println("日曜日");
					break;
				case 1:
					System.out.println("月曜日");
					break;	
				case 2:
					System.out.println("火曜日");
					break;
				case 3:
					System.out.println("水曜日");
					break;
				case 4:
					System.out.println("木曜日");
					break;
				case 5:
					System.out.println("金曜日");
					break;
				case 6:
					System.out.println("土曜日");
					break;
				default:
					System.out.println("0～6の範囲で入力してね！");
					break;
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字を入力してね！");
		}
	}
	
}

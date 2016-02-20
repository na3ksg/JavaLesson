package Lesson5;
import java.io.*;
public class Drink1 {
	public static void main(String[] args) {
		// TODO code application logic here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("飲み物は何が好きですか？");
			System.out.println("1 コーラ");
			System.out.println("2 りんごジュース");
			System.out.println("3 コーヒー");
			System.out.println("4 どれでもない");
			System.out.println("1,2,3,4のどれかをえらんでね");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			switch (n) {
				case 1:
					System.out.println("コーラだね。");
					break;
				case 2:
					System.out.println("りんごジュースだね。");
					break;
				case 3:
					System.out.println("コーヒーだね。");
					break;	
				default:
					System.out.println("どれでもありません。");
					break;
			}
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("数字の形式が正しくないよ！");
		}
	}
	
}

package Lesson4;
import java.io.*;
public class Kasa1 {
	public static void main(String[] args) {
		// TODO code application logic here
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("降水確率を入力してね");
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			System.out.println("降水確率は" + n + "%だよ。");
			if (n < 0 || 100 < n) {
				System.out.println("降水確率は0～100の間ですよ！");
			} else if (n >= 50) {
				System.out.println("傘を忘れずにね。");
			} else {
				System.out.println("傘はいらないよ。");
			}
			System.out.println("いってらっしゃーい");
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println("数字の形式が正しくありません。");
		}
	}
	
}

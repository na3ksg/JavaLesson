package JavaLesson3;
import java.io.*;
public class HowOldAreYou {
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.println("あなたの名前を教えてね");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			System.out.println(line + "さん、こんにちは");
			System.out.println("年齢を入力してね");
			line = reader.readLine();
			int age = Integer.parseInt(line);
			System.out.println("今" + age + "歳なら、10年後は" + (age + 10) + "歳だね！");
		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("年齢が間違っているよ！");
		}
	}
	
}

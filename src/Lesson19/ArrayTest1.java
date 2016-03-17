package Lesson19;

import java.util.ArrayList;

public class ArrayTest1 {
	public static void main(String[] args) {
		// TODO code application logic here
		// ArrayListのインスタンス確保
		ArrayList<String> list = new ArrayList<String>();

		// 要素の追加
		list.add("Risa");
		list.add("Ami");
		list.add("Ken");

		// 要素の参照
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}

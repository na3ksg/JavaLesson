package Lesson19;

import java.util.*;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO code application logic here
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ken");
		list.add("Mike");
		list.add("Yumi");
		list.add("Sarry");
		list.add("Miki");

		System.out.println("削除の前");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();

		// 2人を削除
		list.remove("Ken");
		list.remove("Mike");

		System.out.println("削除の後");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + ":" + list.get(i));
		}
		System.out.println();

		if (list.contains("Ken")) {
			System.out.println("listにKenはいるよ！");
		} else {
			System.out.println("listにKenはいないよ！");
		}

	}

}

package Lesson10;
public class StudentTest {
	public static void main(String[] args) {
		// TODO code application logic here
		Student[] data ={ 
		new Student("車綾", 70, 65, 100),
		new Student("西野裕子", 69, 65, 92),
		new Student("長尾ヒカル", 88, 75, 90),
		new Student("小島ひかり", 80, 57, 77),
		};
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i] + "\t->" + data[i].total());
		}
	}
	
}

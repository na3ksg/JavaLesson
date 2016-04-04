package Shop;
public class PatrolCarToy extends CarToy {
	// コンストラクタ
	public PatrolCarToy(String code, int price) {
		super(code, price);
	}
	public void go() {
		System.out.println("ウーウー、ブロロロッー！");
	}
}

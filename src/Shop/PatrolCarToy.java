package Shop;
public class PatrolCarToy extends CarToy {
	// コンストラクタ
	public PatrolCarToy(String code, int price) {
		super(code, price);
	}
	// サイレンを鳴らす
	public void siren() {
		System.out.println("ウーウー");
	}
}

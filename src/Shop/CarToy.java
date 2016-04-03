package Shop;
public class CarToy {
	String code_;// 商品コード
	int price_;// 価格

	public CarToy(String code, int price) {
		code_ = code;
		price_ = price;
	}
	
	public void go() {
		System.out.println("ブーン！！！");
	}	

	public void light() {
		System.out.println("ピカー！！！");
	}
}

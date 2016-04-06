package Shop;
public class CarToy implements Toy {
	private String code_;// 商品コード
	private int price_;// 価格

	public CarToy(String code, int price) {
		code_ = code;
		price_ = price;
	}


	public String getCode() {
		return code_;
	}

	public int getPrice() {
		return price_;
	}

	public void setPrice(int newPrice) {
		if(newPrice > 0) {
			price_ = newPrice;
		} else {
			// エラー処理
		}
	}
	
	public void go() {
		System.out.println("ブーン！！！");
	}	

	public void light() {
		System.out.println("ピカー！！！");
	}
}

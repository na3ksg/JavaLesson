package Shop;
public class TrainToy implements Toy {
	private String code_;
	private int price_;

	public TrainToy(String code, int price) {
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
			// エラー時の処理
		}
	}

	public void go() {
		System.out.println("ガタンゴトン！！！");
	}

	public void out() {
		System.out.println("フォーン！！！");
	}
	
}

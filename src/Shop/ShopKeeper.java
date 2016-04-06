package Shop;
public class ShopKeeper {
	private String name_;
	private Demo demo_;

	public ShopKeeper(String name, Demo demo) {
		name_ = name;
		demo_ = demo;
	}

	public void checkPrice(CarToy kuruma1, CarToy patoka, TrainToy densya) {
		System.out.println("私が店長の" + name_ + "だ！これから価格をチェックするぞ！");
		System.out.println("商品コード：" + kuruma1.getCode() + "の価格は" + kuruma1.getPrice() + "です。");
		System.out.println("商品コード：" + patoka.getCode() + "の価格は" + patoka.getPrice() + "です。");
		System.out.println("商品コード：" + densya.getCode() + "の価格は" + densya.getPrice() + "です。");
		System.out.println("\n");
		
	}

	public void doDemo(CarToy kuruma, PatrolCarToy patoka, TrainToy densya) {
		System.out.println("私が店長の" + name_ + "だ！これからデモをするぞ！");
		demo_.execute(kuruma, patoka, densya);
		System.out.println("\n");
		
	}
	
}

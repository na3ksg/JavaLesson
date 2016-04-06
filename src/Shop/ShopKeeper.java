package Shop;
public class ShopKeeper {
	private String name_;

	public ShopKeeper(String name) {
		name_ = name;
	}

	public void checkPrice(CarToy kuruma1, CarToy patoka, TrainToy train1) {
		System.out.println("私が店長の" + name_ + "だ！これから価格をチェックするぞ！");
		System.out.println("商品コード：" + kuruma1.getCode() + "の価格は" + kuruma1.getPrice() + "です。");
		System.out.println("商品コード：" + patoka.getCode() + "の価格は" + patoka.getPrice() + "です。");
		System.out.println("商品コード：" + train1.getCode() + "の価格は" + train1.getPrice() + "です。");
		System.out.println("\n");
		
	}

	public void doDemo(Toy omocha) {
		System.out.println("私が店長の" + name_ + "だ！これからデモをするぞ！");
		System.out.println("オモチャを走らせるぞ！");
		omocha.go();
		System.out.println("\n");
		
	}
	
}

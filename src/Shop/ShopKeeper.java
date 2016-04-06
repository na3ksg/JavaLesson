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

	public void doDemo(CarToy kuruma1,  CarToy patoka, TrainToy train1) {
		System.out.println("私が店長の" + name_ + "だ！これからデモをするぞ！");
		System.out.println("クルマ1を走らせるぞ！");
		kuruma1.go();
		System.out.println("パトカーを走らせるぞ！");
		patoka.go();
		System.out.println("電車を走らせるぞ！");
		train1.go();
		System.out.println("\n");
		
	}
	
}

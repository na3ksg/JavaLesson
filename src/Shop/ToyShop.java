package Shop;
public class ToyShop {
	public static void main(String[] args) {
		// TODO code application logic here
		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001", 500);
		CarToy car2 = new CarToy("c002", 500);
		TrainToy train1 = new TrainToy("t001", 700);

		suzuki.checkPrice(car1, car2, train1);

		suzuki.doDemo(car1, car2, train1);

	}
	
}

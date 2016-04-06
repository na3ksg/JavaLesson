package Shop;
public class ToyShop {
	public static void main(String[] args) {
		// TODO code application logic here
		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001", 500);
		PatrolCarToy patrolcar1 = new PatrolCarToy("p001", 600);
		TrainToy train1 = new TrainToy("t001", 700);
		
		Toy toy = train1;// デモするオモチャを指定
		suzuki.checkPrice(car1, patrolcar1, train1);
		suzuki.doDemo(toy);

	}
	
}

package Shop;
public class ToyShop {
	public static void main(String[] args) {
		// TODO code application logic here
		GoDemo demo1 = new GoDemo();
		ExceptGoDemo demo2 = new ExceptGoDemo();
		FullDemo demo3 = new FullDemo();
		Demo demo = demo1;// 実施するデモのパターンを指定
		
		ShopKeeper suzuki = new ShopKeeper("鈴木", demo);
		CarToy car1 = new CarToy("c001", 500);
		PatrolCarToy patrolcar1 = new PatrolCarToy("p001", 600);
		TrainToy train1 = new TrainToy("t001", 700);
		
		suzuki.checkPrice(car1, patrolcar1, train1);
		suzuki.doDemo(car1, patrolcar1, train1);

	}
	
}

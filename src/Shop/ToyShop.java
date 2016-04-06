package Shop;
public class ToyShop {
	public static void main(String[] args) {
		// TODO code application logic here
		ShopKeeper suzuki = new ShopKeeper("鈴木");
		CarToy car1 = new CarToy("c001", 500);
		PatrolCarToy patrolcar1 = new PatrolCarToy("p001", 600);
		TrainToy train1 = new TrainToy("t001", 700);

		suzuki.checkPrice(car1, patrolcar1, train1);

		System.out.println("特別セールだよ！電車の値段を600円に値下げだ！");
		train1.setPrice(600);
		suzuki.checkPrice(car1, patrolcar1, train1);

		suzuki.doDemo(car1, patrolcar1, train1);

	}
	
}

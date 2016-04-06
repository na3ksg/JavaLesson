package Shop;
import java.util.ArrayList;
public class ToyShop {
	public static void main(String[] args) {
		// TODO code application logic here
		Demo demo = new GoDemo();	
		ShopKeeper suzuki = new ShopKeeper("鈴木", demo);
		CarToy car1 = new CarToy("c001", 500);
		PatrolCarToy patrolcar1 = new PatrolCarToy("p001", 600);
		TrainToy train1 = new TrainToy("t001", 700);

		ArrayList<Toy> toys = new ArrayList<Toy>();
		toys.add(car1);
		toys.add(patrolcar1);
		toys.add(train1);
		
		suzuki.checkPrice(car1, patrolcar1, train1);
		suzuki.doDemo(toys);

	}
	
}

package Shop;
import java.util.ArrayList;
public class GoDemo implements Demo {
	public void execute(ArrayList<Toy> omocha) {
		for(int i = 0; i < omocha.size(); i++) {
			Toy toy = omocha.get(i);
			toy.go();
		}
	}
}

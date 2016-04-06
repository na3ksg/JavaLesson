package Shop;
public class GoDemo implements Demo {
	public void execute(CarToy kuruma, PatrolCarToy patoka, TrainToy densya) {
		kuruma.go();
		patoka.go();
		densya.go();
	}
}

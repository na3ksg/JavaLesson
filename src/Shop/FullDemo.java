package Shop;
public class FullDemo implements Demo {
	public void execute(CarToy kuruma, PatrolCarToy patoka, TrainToy densya) {
		kuruma.go();
		kuruma.light();
		patoka.go();
		patoka.light();
		densya.go();
		densya.horn();
	}
}

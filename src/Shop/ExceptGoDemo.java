package Shop;
public class ExceptGoDemo implements Demo {
	public void execute(CarToy kuruma, PatrolCarToy patoka, TrainToy densya) {
		kuruma.light();
		patoka.light();
		densya.horn();
	}
}

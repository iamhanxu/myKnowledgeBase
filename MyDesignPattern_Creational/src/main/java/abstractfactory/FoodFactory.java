package abstractfactory;

public class FoodFactory {

	public static Food produceFood(FoodAbstractFactory factory) {

		if (factory != null) {
			return factory.produceFood();
		}
		return null;
	}
}

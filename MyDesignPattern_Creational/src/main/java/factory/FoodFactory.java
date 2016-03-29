package factory;

public class FoodFactory {

	public static Food produceFood(String sel) {
		// F -- fast food, K-- korean food, s--Sushi FOOD

		if (sel == null) {
			return null;
		} else if ("F".equalsIgnoreCase(sel)) {
			return new FastFood();
		} else if ("S".equalsIgnoreCase(sel)) {
			return new SushiFood();
		} else if ("K".equalsIgnoreCase(sel)) {
			return new KoreanFood();
		} else {
			return null;
		}
	}

}

package abstractfactory;

public class KoreanFoodAbstractFactory implements FoodAbstractFactory {

	@Override
	public Food produceFood() {
		// TODO Auto-generated method stub
		return new KoreanFood();
	}

}

package abstractfactory;

public class FastFoodAbstractFactory implements FoodAbstractFactory {

	@Override
	public Food produceFood() {
		// TODO Auto-generated method stub
		return new FastFood();
	}

}

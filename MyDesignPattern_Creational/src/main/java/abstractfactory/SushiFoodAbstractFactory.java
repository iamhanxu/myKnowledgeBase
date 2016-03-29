package abstractfactory;

public class SushiFoodAbstractFactory implements FoodAbstractFactory {

	@Override
	public Food produceFood() {
		// TODO Auto-generated method stub
		return new SushiFood();
	}

}

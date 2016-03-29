package abstractfactory;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FoodAbstractFactory factory = new SushiFoodAbstractFactory();
		Food food = FoodFactory.produceFood(factory);
		if(food != null){
			food.describe();
		}
		
		
	    factory = new FastFoodAbstractFactory();
		food = FoodFactory.produceFood(factory);
		if(food != null){
			food.describe();
		}
		
	    factory = new KoreanFoodAbstractFactory();
		food = FoodFactory.produceFood(factory);
		if(food != null){
			food.describe();
		}
	}

}

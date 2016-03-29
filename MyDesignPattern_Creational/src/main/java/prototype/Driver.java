package prototype;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrototypeCapable p = PrototypeFactory.getInstance(Constant.ALBUM);
		System.out.println(p.toString());

		p = PrototypeFactory.getInstance(Constant.MOVIE);
		System.out.println(p.toString());

		p = PrototypeFactory.getInstance(Constant.SHOW);
		System.out.println(p.toString());

	}

}

package prototype;

public class Movie implements PrototypeCapable {

	private String name = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		System.out.println("Clone the movie");
		Movie tmp = (Movie) super.clone();
		return tmp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Constant.MOVIE;
	}

}

package prototype;

public class Show implements PrototypeCapable {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {

		System.out.println("clone the Show");
		Show tmp = (Show) super.clone();
		return tmp;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Constant.SHOW;
	}

}

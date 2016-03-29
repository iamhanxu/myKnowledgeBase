package prototype;

import java.util.HashMap;

public class PrototypeFactory {

	private static HashMap<String, PrototypeCapable> prototypeMap;

	static {
		prototypeMap = new HashMap<String, PrototypeCapable>();
		prototypeMap.put(Constant.ALBUM, new Album());
		prototypeMap.put(Constant.MOVIE, new Movie());
		prototypeMap.put(Constant.SHOW, new Show());
	}

	public static PrototypeCapable getInstance(String sel) {

		PrototypeCapable tmp;
		try {
			tmp = ((PrototypeCapable) prototypeMap.get(sel)).clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			tmp = null;
		}
		return tmp;
	}
}

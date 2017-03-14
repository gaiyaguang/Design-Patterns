package factory_abstract;
/**
 * 女性工厂类
 */
public class FemaleFactory {

	public static Human createFemaleWhiteHuman(){//创建女性白人
		Human human=new FemaleWhiteHuman();
		return human;
	}
	
	public static Human createFemaleBlackHuman(){//创建女性黑人
		Human human=new FemaleBlackHuman();
		return human;
	}
	
	public static Human createFemaleYellowHuman(){//创建女性黄种人
		Human human=new FemaleYellowHuman();
		return human;
	}
}

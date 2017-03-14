package factory_abstract;

public class MaleFactory {
	
	public static Human createMaleWhiteHuman(){//创建男性白人
		Human human=new MaleWhiteHuman();
		return human;
	}
	
	public static Human createMaleBlackHuman(){//创建男性黑人
		Human human=new MaleBlackHuman();
		return human;
	}
	
	public static Human createMaleYellowHuman(){//创建男性黄种人
		Human human=new MaleYellowHuman();
		return human;
	}

}

package factory_abstract;

public class MaleFactory {
	
	public static Human createMaleWhiteHuman(){//�������԰���
		Human human=new MaleWhiteHuman();
		return human;
	}
	
	public static Human createMaleBlackHuman(){//�������Ժ���
		Human human=new MaleBlackHuman();
		return human;
	}
	
	public static Human createMaleYellowHuman(){//�������Ի�����
		Human human=new MaleYellowHuman();
		return human;
	}

}

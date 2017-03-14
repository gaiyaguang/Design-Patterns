package factory_abstract;
/**
 * Ů�Թ�����
 */
public class FemaleFactory {

	public static Human createFemaleWhiteHuman(){//����Ů�԰���
		Human human=new FemaleWhiteHuman();
		return human;
	}
	
	public static Human createFemaleBlackHuman(){//����Ů�Ժ���
		Human human=new FemaleBlackHuman();
		return human;
	}
	
	public static Human createFemaleYellowHuman(){//����Ů�Ի�����
		Human human=new FemaleYellowHuman();
		return human;
	}
}

package factory_simple;
/**
 * �����࣬�ṩ��̬�������������ⲿ����ʵ��
 * @author 77473
 *
 */
public class HumanFactory {
	
	public static <T extends Human> T createHuman(Class<T> c){//���ݴ�����ഴ��ʵ��
		
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();//������ʵ��
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T) human;
	}

}

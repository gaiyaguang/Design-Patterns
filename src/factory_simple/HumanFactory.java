package factory_simple;
/**
 * 工厂类，提供静态公共方法，供外部创建实例
 * @author 77473
 *
 */
public class HumanFactory {
	
	public static <T extends Human> T createHuman(Class<T> c){//根据传入的类创建实例
		
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();//创建类实例
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

package template;


/**
 * 场景类
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HummerModel model1=new HummerH1();
		model1.run();//HummerH1实例运行
		System.out.print("\n");
		HummerModel model2=new HummerH2();
		model2.run();//HummerH2实例运行
	}
}

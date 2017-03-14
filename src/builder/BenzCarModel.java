package builder;

/**
 * Benz车的具体模板，实现抽象模板的方法
 */
public class BenzCarModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz车启动...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("Benz车引擎启动...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Benz车喇叭声响...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz车停止");
	}
	

}

package builder;

/**
 *BMW车的具体模板，实现抽象模板的方法
 */
public class BMWCarModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW车启动...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("BMW车引擎启动...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("BMW车喇叭声响...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW车停止");
	}

}

package builder;

/**
 *BMW���ľ���ģ�壬ʵ�ֳ���ģ��ķ���
 */
public class BMWCarModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW������...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("BMW����������...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("BMW����������...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("BMW��ֹͣ");
	}

}

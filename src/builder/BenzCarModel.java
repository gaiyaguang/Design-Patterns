package builder;

/**
 * Benz���ľ���ģ�壬ʵ�ֳ���ģ��ķ���
 */
public class BenzCarModel extends CarModel{

	@Override
	protected void start() {
		// TODO Auto-generated method stub
		System.out.println("Benz������...");
	}

	@Override
	protected void engineBoom() {
		// TODO Auto-generated method stub
		System.out.println("Benz����������...");
	}

	@Override
	protected void alarm() {
		// TODO Auto-generated method stub
		System.out.println("Benz����������...");
	}

	@Override
	protected void stop() {
		// TODO Auto-generated method stub
		System.out.println("Benz��ֹͣ");
	}
	

}

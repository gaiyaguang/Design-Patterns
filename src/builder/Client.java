package builder;

/**
 * ������
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director=new Director();
		System.out.println("===����һ��A��Benz��ģ��===");
		CarModel benzA=director.getABenzCarModel();
		benzA.run();
		System.out.println("===����һ��B��Benz��ģ��===");
		CarModel benzB=director.getBBenzCarModel();
		benzB.run();
		System.out.println("===����һ��C��BMW��ģ��===");
		CarModel bmwC=director.getCBMWCarModel();
		bmwC.run();
		System.out.println("===����һ��D��BMW��ģ��===");
		CarModel bmwD=director.getDBMWCarModel();
		bmwD.run();
	}

}

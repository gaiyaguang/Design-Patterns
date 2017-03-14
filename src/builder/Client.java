package builder;

/**
 * 场景类
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Director director=new Director();
		System.out.println("===生产一辆A类Benz车模型===");
		CarModel benzA=director.getABenzCarModel();
		benzA.run();
		System.out.println("===生产一辆B类Benz车模型===");
		CarModel benzB=director.getBBenzCarModel();
		benzB.run();
		System.out.println("===生产一辆C类BMW车模型===");
		CarModel bmwC=director.getCBMWCarModel();
		bmwC.run();
		System.out.println("===生产一辆D类BMW车模型===");
		CarModel bmwD=director.getDBMWCarModel();
		bmwD.run();
	}

}

package factory_simple;
/**
 * 场景类，女娲造人
 */
public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=null;
		System.out.println("===女娲第一次造人，火候不够，白种人产生了===");
		human=HumanFactory.createHuman(WhiteHuman.class);
		human.talk();
		human.color();
		System.out.println("===女娲第二次造人，火候太过，黑种人产生了===");
		human=HumanFactory.createHuman(BlackHuman.class);
		human.talk();
		human.color();
		System.out.println("===女娲第三次造人，火候正好，黄种人产生了===");
		human=HumanFactory.createHuman(WhiteHuman.class);
		human.talk();
		human.color();
	}

}

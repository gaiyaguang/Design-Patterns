package factory_simple;
/**
 * �����࣬Ů�����
 */
public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=null;
		System.out.println("===Ů洵�һ�����ˣ���򲻹��������˲�����===");
		human=HumanFactory.createHuman(WhiteHuman.class);
		human.talk();
		human.color();
		System.out.println("===Ů洵ڶ������ˣ����̫���������˲�����===");
		human=HumanFactory.createHuman(BlackHuman.class);
		human.talk();
		human.color();
		System.out.println("===Ů洵��������ˣ�������ã������˲�����===");
		human=HumanFactory.createHuman(WhiteHuman.class);
		human.talk();
		human.color();
	}

}

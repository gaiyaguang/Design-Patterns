package factory_abstract;

/**
 * �����࣬Ů�����
 */
public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=null;
		System.out.println("===Ů洵�һ�����ˣ�һ������Ů�ԣ�һ����������===");
		human=FemaleFactory.createFemaleWhiteHuman();
		human.talk();
		human.color();
		human.sex();
		human=MaleFactory.createMaleWhiteHuman();
		human.talk();
		human.color();
		human.sex();
		System.out.println("===Ů洵ڶ������ˣ�һ��������Ů�ԣ�һ����������===");
		human=FemaleFactory.createFemaleBlackHuman();
		human.talk();
		human.color();
		human.sex();
		human=MaleFactory.createMaleBlackHuman();
		human.talk();
		human.color();
		human.sex();
		System.out.println("===Ů洵��������ˣ�һ������Ů�ԣ�һ����������===");
		human=FemaleFactory.createFemaleYellowHuman();
		human.talk();
		human.color();
		human.sex();
		human=MaleFactory.createMaleYellowHuman();
		human.talk();
		human.color();
		human.sex();
	}
}

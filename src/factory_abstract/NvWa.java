package factory_abstract;

/**
 * 场景类，女娲造人
 */
public class NvWa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=null;
		System.out.println("===女娲第一次造人，一个白种女性，一个白种男性===");
		human=FemaleFactory.createFemaleWhiteHuman();
		human.talk();
		human.color();
		human.sex();
		human=MaleFactory.createMaleWhiteHuman();
		human.talk();
		human.color();
		human.sex();
		System.out.println("===女娲第二次造人，一个黑种种女性，一个黑种男性===");
		human=FemaleFactory.createFemaleBlackHuman();
		human.talk();
		human.color();
		human.sex();
		human=MaleFactory.createMaleBlackHuman();
		human.talk();
		human.color();
		human.sex();
		System.out.println("===女娲第三次造人，一个黄种女性，一个黄种男性===");
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

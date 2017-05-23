package composite.safe;

import java.util.ArrayList;
/**
 * 场景类
 */
public class Client {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Branch ceo=new Branch("章建丰","总经理","200w");//总经理
		Branch techDirector=new Branch("周勇军","技术总监","100w");//技术总监
		techDirector.addSubordinate(new Leaf("张涛","IOS开发工程师","20k"));//ios开发工程师
		techDirector.addSubordinate(new Leaf("魏庭聪","Android开发工程师","20k"));//android开发工程师
		techDirector.addSubordinate(new Leaf("冯适","PHP开发工程师","20k"));//php开发工程师
		Branch marketDirector=new Branch("宗玺","市场总监","100w");//市场总监
		marketDirector.addSubordinate(new Leaf("张敏","市场营销","30k"));//市场营销
		marketDirector.addSubordinate(new Leaf("史帅","市场营销","30k"));//市场营销
		marketDirector.addSubordinate(new Leaf("王耀","市场营销","30k"));//市场营销
		ceo.addSubordinate(techDirector);
		ceo.addSubordinate(marketDirector);
		print(ceo);//遍历所有节点信息
	}
	
	/**
	 * 打印所有节点信息
	 * @param root 根节点
	 */
	private static void print(Branch root){
		ArrayList<AbstractCorp> subordinates=root.getAllSubordinates();
		for(AbstractCorp subordinate:subordinates){
			if(subordinate instanceof Leaf){//叶子节点
				subordinate.getInfo();//打印叶子节点的信息
			}else{
				subordinate.getInfo();//打印树枝节点信息
				print((Branch)subordinate);//递归遍历树枝节点
			}
		}
	}

}

package chain;

import java.util.ArrayList;
import java.util.Random;

/**
 * 场景类
 */
public class Client {

	public static void main(String[] args){
		Random random=new Random();//产生女子婚姻状态的随机数
		ArrayList<IWomen> womens=new ArrayList<IWomen>(){};//女子集合
		for(int i=0;i<3;i++){//初始化3个女子对象
			IWomen women=new Women(random.nextInt(3),"我要出去看电影");
			womens.add(women);
		}
		FatherHandler father=new FatherHandler();//父亲处理者
		HusbandHandler husband=new HusbandHandler();//丈夫处理者
		SonHandler son=new SonHandler();//儿子处理着
		father.setNext(husband);//设置父亲的下级处理者为丈夫
		husband.setNext(son);//设置丈夫的下级处理者为儿子
		for(IWomen women:womens){//遍历女子集合
			father.handleMessage(women);//先交给最顶级的处理者处理，处理不了方法内部会自动查找下级处理者
		}
	}
}

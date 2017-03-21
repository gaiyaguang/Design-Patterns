package chain;

import java.util.ArrayList;
import java.util.Random;

/**
 * ������
 */
public class Client {

	public static void main(String[] args){
		Random random=new Random();//����Ů�ӻ���״̬�������
		ArrayList<IWomen> womens=new ArrayList<IWomen>(){};//Ů�Ӽ���
		for(int i=0;i<3;i++){//��ʼ��3��Ů�Ӷ���
			IWomen women=new Women(random.nextInt(3),"��Ҫ��ȥ����Ӱ");
			womens.add(women);
		}
		FatherHandler father=new FatherHandler();//���״�����
		HusbandHandler husband=new HusbandHandler();//�ɷ�����
		SonHandler son=new SonHandler();//���Ӵ�����
		father.setNext(husband);//���ø��׵��¼�������Ϊ�ɷ�
		husband.setNext(son);//�����ɷ���¼�������Ϊ����
		for(IWomen women:womens){//����Ů�Ӽ���
			father.handleMessage(women);//�Ƚ�������Ĵ����ߴ��������˷����ڲ����Զ������¼�������
		}
	}
}

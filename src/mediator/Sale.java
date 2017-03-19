package mediator;

import java.util.Random;

/**
 * ������
 */
public class Sale extends AbstractColleague{

	public Sale(AbstractMediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ����һ����Ŀ����Ʒ
	 */
	public void sale(int num){
		super.mediator.exec("sale.sale",num);//��ȡ������������治�磬��Ҫ�ɹ����вɹ���
	}
	
	/**
	 * ��ȡ����״��
	 */
	public int getStatus(){
		Random random=new Random();
		int result=random.nextInt(100);//�������һ��0-100����ֵ��0����û����100����ǳ�����������������������ⲿ�࣬����Ҫ�ŵ��н�����ִ�С�
		if(result>80){
			System.out.println("�����������...");
		}else{
			System.out.println("�����������...");
		}
		return result;
	}
	
	/**
	 * ��������
	 */
	public void offSale(){
		super.mediator.exec("sale.offsale");//�ɹ�ֹͣ�ɹ����ֿ���֡�
	}
}

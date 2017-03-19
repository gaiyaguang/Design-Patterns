package mediator;
/**
 * �����ս�����
 */
public abstract class AbstractMediator {
	
	protected Purchase purchase;//�ɹ�����
	
	protected Sale sale;//���۶���
	
	protected Stock stock;//�ֿ����
	
	public AbstractMediator(){
		this.purchase=new Purchase(this);
		this.sale=new Sale(this);
		this.stock=new Stock(this);
	}
	
	//�н�������Ҫ�ķ������¼���������������������֮��Ĺ�ϵ
	public abstract void exec(String str,Object ...objects);

}

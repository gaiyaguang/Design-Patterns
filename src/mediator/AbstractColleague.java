package mediator;
/**
 * ����ͬ���࣬����ͬ�µĹ�������
 */
public abstract class AbstractColleague {

	protected AbstractMediator mediator;//�н���
	
	public AbstractColleague(AbstractMediator mediator){//���췽��������һ���н��߶���
		this.mediator=mediator;
	}
}

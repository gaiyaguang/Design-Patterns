package decorator;
/**
 * 抽象装饰者类，继承抽象成绩单类
 */
public abstract class AbstractDecorator extends AbstractReport{
	
	private AbstractReport report;//成绩单
	
	public AbstractDecorator(AbstractReport report){//构造函数，传入一个要装饰的成绩单
		this.report=report;
	}

	@Override
	public void report() {//展示成绩
		// TODO Auto-generated method stub
		this.report.report();//调用成绩单的report方法
	}

	@Override
	public void sign(String name) {//家长签名
		// TODO Auto-generated method stub
		this.report.sign(name);//调用成绩单的sign方法
	}
	
	
}

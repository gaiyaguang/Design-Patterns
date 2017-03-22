package decorator;
/**
 * 排名装饰类
 */
public class SortDecorator extends AbstractDecorator{

	public SortDecorator(AbstractReport report) {
		super(report);//掉用父类的构造方法
		// TODO Auto-generated constructor stub
	}

	@Override
	public void report() {//展示成绩
		// TODO Auto-generated method stub
		sortReport();//报告成绩前，先报告班级排名
		super.report();//调用父类的report方法
	}

	@Override
	public void sign(String name) {//签名
		// TODO Auto-generated method stub
		super.sign(name);//调用父类的sign方法
	}

	private void sortReport(){//报告本次考试的班级排名
		System.out.println("我这次考试的班级排名是：13");
	}
}

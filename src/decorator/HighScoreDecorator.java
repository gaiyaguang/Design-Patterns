package decorator;
/**
 * 最高成绩修饰者类
 */
public class HighScoreDecorator extends AbstractDecorator{

	public HighScoreDecorator(AbstractReport report) {
		super(report);//调用父类的构造方法
		// TODO Auto-generated constructor stub
	}

	@Override
	public void report() {//展示成绩
		// TODO Auto-generated method stub
		reportHighScore();//报告成绩前，先报告最高成绩
		super.report();//调用父类的报告方法
	}

	@Override
	public void sign(String name) {//家长签名
		// TODO Auto-generated method stub
		super.sign(name);//调用父类的签名方法
	}
	
	private void reportHighScore(){//报告最高成绩
		System.out.println("这次考试语文最高，87分，数学73分，英语67分");
	}

}

package decorator;
/**
 * 场景类
 */
public class Client {

	public static void main(String[] args){
		AbstractReport report;//成绩单对象
		report=new ForthReport();//原装的成绩单
		report=new HighScoreDecorator(report);//加了最高成绩修饰的成绩单
		report=new SortDecorator(report);//再加上班级排名的成绩单
		report.report();//报告成绩
		report.sign("张三他爹");
	}
}

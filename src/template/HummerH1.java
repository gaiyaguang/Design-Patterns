package template;


/**
 * 具体模板，实现抽象模板中的基本方法
 */
public class HummerH1 extends HummerModel{

	@Override
    protected void start() {
        super.start();
        System.out.println("悍马H1启动...");
    }

    @Override
    protected void engineBoom() {
        super.engineBoom();
        System.out.println("悍马H1引擎轰鸣...");
    }

    @Override
    protected void alarm() {
        super.alarm();
        System.out.println("悍马H1喇叭声响...");
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("悍马车H2停止...");
    }
}

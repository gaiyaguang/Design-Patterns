package template;


/**
 * 具体模板，实现抽象模板中的基本方法
 */
public class HummerH2 extends HummerModel{
	
	@Override
    protected void start() {
        super.start();
        System.out.println("悍马H2启动...");
    }

    @Override
    protected void engineBoom() {
        super.engineBoom();
        System.out.println("悍马H2引擎轰鸣...");
    }

    @Override
    protected void alarm() {
        super.alarm();
        System.out.println("悍马H2喇叭声响...");
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("悍马车H2停止...");
    }
    
    @Override
    protected boolean isAlarm() {
        return false;//H2引擎启动后没有喇叭鸣响
    }
}

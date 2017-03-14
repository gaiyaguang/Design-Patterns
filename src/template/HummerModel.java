package template;

/**
 * 抽象模板类，定义一个操作的算法的框架，而将一些步骤延迟到子类中。
 */
public abstract class HummerModel {
	
	protected void start(){}//基本方法，启动

    protected void engineBoom(){}//基本方法，引擎声响

    protected void alarm(){}//基本方法，喇叭声响

    protected void stop(){}//基本方法，停止

    protected boolean isAlarm(){//基本方法，钩子方法，子类可以通过重写该方法控制引擎启动后是否有喇叭声响
        return true;//默认引擎启动后有喇叭声响
    }

    final public void run(){//模板方法，调用基本方法，完成固定的操作步骤。final 关键字不允许子类复写该方法。
        this.start();
        this.engineBoom();
        if (this.isAlarm()) this.alarm();
        this.stop();
    }

}

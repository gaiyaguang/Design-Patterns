package template;


/**
 * ����ģ�壬ʵ�ֳ���ģ���еĻ�������
 */
public class HummerH1 extends HummerModel{

	@Override
    protected void start() {
        super.start();
        System.out.println("����H1����...");
    }

    @Override
    protected void engineBoom() {
        super.engineBoom();
        System.out.println("����H1�������...");
    }

    @Override
    protected void alarm() {
        super.alarm();
        System.out.println("����H1��������...");
    }

    @Override
    protected void stop() {
        super.stop();
        System.out.println("����H2ֹͣ...");
    }
}

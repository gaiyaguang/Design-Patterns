package template;

/**
 * ����ģ���࣬����һ���������㷨�Ŀ�ܣ�����һЩ�����ӳٵ������С�
 */
public abstract class HummerModel {
	
	protected void start(){}//��������������

    protected void engineBoom(){}//������������������

    protected void alarm(){}//������������������

    protected void stop(){}//����������ֹͣ

    protected boolean isAlarm(){//�������������ӷ������������ͨ����д�÷������������������Ƿ�����������
        return true;//Ĭ����������������������
    }

    final public void run(){//ģ�巽�������û�����������ɹ̶��Ĳ������衣final �ؼ��ֲ��������ิд�÷�����
        this.start();
        this.engineBoom();
        if (this.isAlarm()) this.alarm();
        this.stop();
    }

}

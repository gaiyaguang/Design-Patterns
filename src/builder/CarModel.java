package builder;

import java.util.ArrayList;

/**
 * ��������ģ�壬����������ִ��˳��Ļ�������,��ʵ�ֿ�������ִ��˳���ģ�巽��
 */
public abstract class CarModel {
	
	private ArrayList<String> sequence=new ArrayList<String>();//��������ִ��˳��ļ���
	
	protected abstract void start();//����
	
	protected abstract void engineBoom();//��������
	
	protected abstract void alarm(); //��������
	
	protected abstract void stop(); //ֹͣ
	
	final public void run(){//����
		
		for(String str:sequence){//�����������е�˳���б�����˳�����г���
		if(str.equalsIgnoreCase("start")){//��������
			this.start();
		}else if(str.equalsIgnoreCase("engineBoom")){//������������
			this.engineBoom();
		}else if(str.equalsIgnoreCase("alarm")){//������������
			this.alarm();
		}else if(str.equalsIgnoreCase("stop")){//����ֹͣ����
			this.stop();
		}
		}
	}
	
	final public void setSequence(ArrayList<String> sequence){//��������������˳��
		
		this.sequence=sequence;
	}

}

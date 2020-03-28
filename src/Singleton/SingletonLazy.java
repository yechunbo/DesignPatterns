package Singleton;

/**
 * @author YeChunBo
 * @time 2019��7��28��
 *
 *       ��˵�����ӳټ���/����ģʽ
 *       DCL(˫�������ƣ�����ͬʱ�ж���߳����е���һ�� if (instance == null) ��һ����Ҳ����˵����߳��Ѿ��жϵ�ǰʵ��û�б�ʵ������
 *       ��׼��������һ��ʱ��synchronized����ǰ�����������ˣ������̴߳�����ʵ�����ͷ��߳�����
 *       ��ô��һ���߳���Ϊ֮ǰ�Ѿ��ж�ʵ��û�б�ʵ�������ʻ�������ٴδ���ʵ���������ͬ�����������Ҫ�ٴ���֤��ʵ���Ƿ��Ѿ����ڡ�
 */

public class SingletonLazy {
	private static volatile  SingletonLazy instance;

	// 1. ˽�еĹ��췽��
	private SingletonLazy() {
	}

	// 2. ���ⲿ��ȡ��ʵ���ľ�̬����
	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy.class) {
				// DCL:˫��������
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}
		}
		return instance;
	}

	// ��ʽ����������������ͬ���������ܱȽϵͣ�������Ҫ��ȽϸߵĲ�����ʹ��
	public synchronized static SingletonLazy getInstance2() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}

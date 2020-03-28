package Singleton;

/**
 * @author YeChunBo
 * @time 2019��7��28��
 *
 *       ��˵��������ģʽ
 */

public class HungrySingleton {
	// ��̬����
	private static HungrySingleton single = new HungrySingleton();

	// ˽�й�����
	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return single;
	}
}
package Singleton;

/**
 * @author YeChunBo
 * @time 2019��7��28��
 *
 *       ��˵��������ģʽ����֤��
 */

public class SingletonTest extends Thread {

	public void run() {
		// �ӳټ���ģʽ��֤
		// System.out.println("ThreadId: " + Thread.currentThread().getId() + ",
		// Class HashCode: "
		// + SingletonLazy.getInstance().hashCode());
		// ����ģʽģʽ��֤
		// System.out.println("ThreadId: " + Thread.currentThread().getId() + ",
		// Class HashCode: "
		// + HungrySingleton.getInstance().hashCode());
		// ��̬�ڲ���ģʽ��֤
//		System.out.println("ThreadId: " + Thread.currentThread().getId() + ", Class HashCode: "
//				+ NestedSington.getInstance().hashCode());
//		// ö��ģʽ��֤
		System.out.println("ThreadId: " + Thread.currentThread().getId() + ", Class HashCode: "
				+ EnumSington.INSTANCE.hashCode());
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new SingletonTest().start();
		}
	}
}

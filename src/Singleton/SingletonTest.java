package Singleton;

/**
 * @author YeChunBo
 * @time 2019年7月28日
 *
 *       类说明：单例模式的验证类
 */

public class SingletonTest extends Thread {

	public void run() {
		// 延迟加载模式验证
		// System.out.println("ThreadId: " + Thread.currentThread().getId() + ",
		// Class HashCode: "
		// + SingletonLazy.getInstance().hashCode());
		// 饿汉模式模式验证
		// System.out.println("ThreadId: " + Thread.currentThread().getId() + ",
		// Class HashCode: "
		// + HungrySingleton.getInstance().hashCode());
		// 静态内部类模式验证
//		System.out.println("ThreadId: " + Thread.currentThread().getId() + ", Class HashCode: "
//				+ NestedSington.getInstance().hashCode());
//		// 枚举模式验证
		System.out.println("ThreadId: " + Thread.currentThread().getId() + ", Class HashCode: "
				+ EnumSington.INSTANCE.hashCode());
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new SingletonTest().start();
		}
	}
}

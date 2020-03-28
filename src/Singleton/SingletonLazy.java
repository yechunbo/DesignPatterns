package Singleton;

/**
 * @author YeChunBo
 * @time 2019年7月28日
 *
 *       类说明：延迟加载/懒汉模式
 *       DCL(双重锁机制）：当同时有多个线程运行到第一个 if (instance == null) 这一步，也就是说多个线程已经判断当前实例没有被实例化，
 *       在准备进入下一步时，synchronized将当前类引用阻塞了，当该线程创建完实例后释放线程锁，
 *       那么另一个线程因为之前已经判断实例没有被实例化，故还会进行再次创建实例，因此在同步代码块中需要再次验证该实例是否已经存在。
 */

public class SingletonLazy {
	private static volatile  SingletonLazy instance;

	// 1. 私有的构造方法
	private SingletonLazy() {
	}

	// 2. 供外部获取类实例的静态方法
	public static SingletonLazy getInstance() {
		if (instance == null) {
			synchronized (SingletonLazy.class) {
				// DCL:双层锁机制
				if (instance == null) {
					instance = new SingletonLazy();
				}
			}
		}
		return instance;
	}

	// 方式二：整个方法进行同步处理，性能比较低，对性能要求比较高的不建议使用
	public synchronized static SingletonLazy getInstance2() {
		if (instance == null) {
			instance = new SingletonLazy();
		}
		return instance;
	}
}

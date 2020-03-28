package Singleton;

/**
 * @author YeChunBo
 * @time 2019年7月28日
 *
 *       类说明：饿汉模式
 */

public class HungrySingleton {
	// 静态属性
	private static HungrySingleton single = new HungrySingleton();

	// 私有构造器
	private HungrySingleton() {
	}

	public static HungrySingleton getInstance() {
		return single;
	}
}
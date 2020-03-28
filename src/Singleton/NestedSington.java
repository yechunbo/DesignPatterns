package Singleton;

/**
 * @author YeChunBo
 * @time 2020年3月27日
 *
 *       类说明 :静态内部类的方式创建单例模式
 */

public class NestedSington {

	private NestedSington() {
	}

	private static class SingtonHolder {
		private static NestedSington instance = new NestedSington();
	}

	public static NestedSington getInstance() {
		return SingtonHolder.instance;
	}
}

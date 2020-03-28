package Singleton;

/**
 * @author YeChunBo
 * @time 2020��3��27��
 *
 *       ��˵�� :��̬�ڲ���ķ�ʽ��������ģʽ
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

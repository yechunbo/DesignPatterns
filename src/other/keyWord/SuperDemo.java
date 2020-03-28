package other.keyWord;

import java.math.BigInteger;

/**
 * @author YeChunBo
 * @time 2019��7��29��
 *
 *       ��˵�� :Super�ؼ��� Super�ؼ����޷��Ǹ��������ָ��
 */

class FatherClass {
	static int fid = 0;
	int value = 0;

	public void setValue() {
		value = 100;
	}
}

class ChildClass extends FatherClass {
	int cid = 10;
	public void test(int cid) {
		ChildClass childClass = new ChildClass();
		childClass.cid = cid;
		super.fid = 1000;
		super.value = 10;
		super.setValue();
	}
}

class SuperDeom{
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
		childClass.test(1234);
		System.out.println(childClass.cid);
		System.out.println(childClass.fid);
		System.out.println(childClass.value);
	}
}

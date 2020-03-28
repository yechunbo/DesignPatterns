package other.keyWord;

/**
 * @author YeChunBo
 * @time 2019年7月31日
 *
 *       类说明
 */

public class ThisDemo {
	static int i = 0;

	// demo1 :
	public void fun(String str) {
		System.out.println(this.hashCode() + "," + str);
	}

	// demo2 :Simple use of the "this" keyword return the current object
	public ThisDemo returnObj() {
		i++;
		return this;
	}

	public static void main(String[] args) {
		ThisDemo t1 = new ThisDemo();
		ThisDemo t2 = new ThisDemo();
		t1.fun("t1");
		t2.fun("t2");
		System.out.println("Object t1 hashCode: " + t1.hashCode());
		System.out.println("Object t2 hashCode: " + t2.hashCode());

		t1.returnObj().returnObj().returnObj();
		System.out.println("i : " + i);
	}
}
/**
 * 366712642,t1 
 * 1829164700,t2 
 * Object t1 hashCode: 366712642 
 * Object t2 hashCode: 1829164700 
 * i : 3
 */

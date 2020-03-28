package other.keyWord;

/**
 * @author YeChunBo
 * @time 2019年7月30日
 *
 *       类说明
 */

public class StaticDemo {
	int num1;
	static int num2 = 10;
	
	public static void main(String[] args) {
		StaticDemo demo = new StaticDemo();
		StaticDemo demo2 = new StaticDemo();
		demo.num1 = 100;
		StaticDemo.num2 = 1002;
		System.out.println(demo.num1);
		System.out.println(demo.num2);
		System.out.println("=========");
		System.out.println(demo2.num1);
		System.out.println(demo2.num2);
	}

}

package other.test;

import java.util.Random;

/**
 * @author YeChunBo
 * @time 2019年8月2日
 *
 *       类说明
 */

public class ArraysOfPrimitives {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a1[i] + 1;
		}
		for (int i = 0; i < a2.length; i++) {
			System.out.println(a2[i]);
		}
		System.out.println("--------------");
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		System.out.println("------------");
		Random random = new Random(11);
		System.out.println(random.nextInt(222));
	}
}

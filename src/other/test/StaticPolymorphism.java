package other.test;

/**
 * @author YeChunBo
 * @time 2019年8月6日
 *
 *       类说明
 */

// : polymorphism/StaticPolymorphism.java
// Static methods are not polymorphic.
class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}

	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}

	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}

public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // Upcast
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}

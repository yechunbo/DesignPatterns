package other.test;

/**
 * @author YeChunBo
 * @time 2019年8月6日
 *
 *       类说明
 */

public class Polymorphism {
	public static void main(String[] args) {
		Person p = new Student();// 向上转型
		p.eat(); // 编译时调用的是Person,运行时调用的是student
		Student s = (Student) p;
		s.study();
	}
}

class Person {
	Person() {
		System.out.println("调用Person构造器");
	}

	public void eat() {
		System.out.println("吃饭...");
	}
}

class Student extends Person {
	Student() {
		System.out.println("调用Student构造器");
	}

	@Override
	public void eat() {
		System.out.println("吃好吃的...");
	}

	public void study() {
		System.out.println("Learning ...");
	}
}

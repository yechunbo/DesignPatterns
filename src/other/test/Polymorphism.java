package other.test;

/**
 * @author YeChunBo
 * @time 2019��8��6��
 *
 *       ��˵��
 */

public class Polymorphism {
	public static void main(String[] args) {
		Person p = new Student();// ����ת��
		p.eat(); // ����ʱ���õ���Person,����ʱ���õ���student
		Student s = (Student) p;
		s.study();
	}
}

class Person {
	Person() {
		System.out.println("����Person������");
	}

	public void eat() {
		System.out.println("�Է�...");
	}
}

class Student extends Person {
	Student() {
		System.out.println("����Student������");
	}

	@Override
	public void eat() {
		System.out.println("�ԺóԵ�...");
	}

	public void study() {
		System.out.println("Learning ...");
	}
}

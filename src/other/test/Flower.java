package other.test;

//: initialization/Flower.java
// Calling constructors with "this"

//: initialization/TerminationCondition.java
//Using finalize() to detect an object that
//hasn��t been properly cleaned up.
class Book {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize--------" + this.hashCode());
		super.finalize();
	}
}

class Flower {
	public static void main(String[] args) throws Throwable {
		Book book = new Book();
		Book book2 = new Book(); // �ö��󲻻����finalize����
		System.out.println("book hashCode:" + book.hashCode());
		new Book();// hashCode:1951797200
		book.finalize(); // ������ʽ����finalize����
		System.gc(); // ��ʾ����GC,new Book()�ö��󴴽���û���������ã����Ҳ�����finalize����
	}
}
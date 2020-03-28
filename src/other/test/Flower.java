package other.test;

//: initialization/Flower.java
// Calling constructors with "this"

//: initialization/TerminationCondition.java
//Using finalize() to detect an object that
//hasn’t been properly cleaned up.
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
		Book book2 = new Book(); // 该对象不会调用finalize方法
		System.out.println("book hashCode:" + book.hashCode());
		new Book();// hashCode:1951797200
		book.finalize(); // 对象显式调用finalize方法
		System.gc(); // 显示调用GC,new Book()该对象创建后没有正常引用，因而也会调用finalize方法
	}
}
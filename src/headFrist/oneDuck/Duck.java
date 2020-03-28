package headFrist.oneDuck;

/**
 * @author YeChunBo
 * @time 2020��3��7��
 *
 *       ��˵��
 */

public abstract class Duck {
	public void swim() {
		System.out.println(this.getClass() + ", swim...");
	}

	public void quack() {
		System.out.println(this.getClass() + ", quack...");
	}

	public abstract void display();
}

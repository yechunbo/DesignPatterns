package factoryPattern.simpleFactory;

/**
 * @author YeChunBo
 * @time 2020��3��12��
 *
 *       ��˵��
 */

public class SimpleFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}
		return pizza;
	}

}

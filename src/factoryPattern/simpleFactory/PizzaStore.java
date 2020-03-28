package factoryPattern.simpleFactory;

/**
 * @author YeChunBo
 * @time 2020年3月12日
 *
 *       类说明 第一版代码，没有运用简单工厂模式
 */

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza();
		} else if ("greek".equals(type)) {
			pizza = new GreekPizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new PepperoniPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}

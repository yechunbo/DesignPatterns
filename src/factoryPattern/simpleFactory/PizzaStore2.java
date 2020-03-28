package factoryPattern.simpleFactory;

/**
 * @author YeChunBo
 * @time 2020年3月12日
 *
 *       类说明 第二版通过简单工厂模式实现
 */

public class PizzaStore2 {

	SimpleFactory factory;
	public PizzaStore2(SimpleFactory factory){
		this.factory = factory;
	}

	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
        System.out.println("Pizza type class is " + pizza.getClass());
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	public static void main(String[] args) {
		SimpleFactory simpleFactory = new SimpleFactory();
		PizzaStore2 store = new PizzaStore2(simpleFactory);
		store.orderPizza("cheese");
	}
}

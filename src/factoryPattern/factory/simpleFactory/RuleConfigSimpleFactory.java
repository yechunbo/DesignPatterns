package factoryPattern.factory.simpleFactory;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.JsonRuleConfigParser;
import factoryPattern.factory.entity.PropertiesRuleConfigParser;
import factoryPattern.factory.entity.XmlRuleConfigParser;
import factoryPattern.factory.entity.YamlRuleConfigParser;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *
 *       类说明 ：简单工厂模式，当有新的解析格式出现时，
 *       只需要往该类中createParser方法添加对应的解释逻辑以及添加一个继承自IRuleConfigParser类的解析该格式文件的类
 *       优点：所有的业务代码都集中在工厂类中，代码逻辑简单
 *       缺点：当业务特别复杂后，该简单工厂类便难以维护，这里再次运用多态特性对该工厂进行抽取（也就是工厂方法模式）
 */

public class RuleConfigSimpleFactory {

	public static IRuleConfigParser createParser(String ruleConfigFileExtension) {
		IRuleConfigParser parser = null;
		if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new JsonRuleConfigParser();
		} else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new XmlRuleConfigParser();
		} else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new YamlRuleConfigParser();
		} else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new PropertiesRuleConfigParser();
		} else {
			System.out.println("Rule config file format is not supported");
		}
		return parser;
	}

}

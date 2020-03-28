package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.RuleConfig;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *
 *       类说明:使用简单工厂模式
 *       如有新文件格式要进行解析，则只需要添加到如下else if分支，并创建该解析方式对应的解析工厂
 *       看如下该类感觉这跟原先的代码并无啥差别，但是如果对于创建对应解析的实体中包含复杂逻辑就大有用处。
 *       当然还可以对下面进行进一步的优化，如添加RuleConfigParserFactoryMap类也就是工厂的工厂类
 */

public class RuleConfigSource2 {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		RuleConfigFactory factory = null;
		if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
			factory = new JsonRuleConfigParserFactory();
		} else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
			factory = new XmlRuleConfigParserFactory();
		} else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
			factory = new YamlRuleConfigParserFactory();
		} else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
			factory = new PropertiesRuleConfigParserFactory();
		} else {
			System.out.println("Rule config file format is not supported: " + ruleConfigFilePath);
		}

		String configText = "";
		// 从ruleConfigFilePath文件中读取配置文本到configText中
		RuleConfig ruleConfig = factory.createParser().parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...解析文件名获取扩展名，比如rule.json，返回json
		return "json";
	}
}

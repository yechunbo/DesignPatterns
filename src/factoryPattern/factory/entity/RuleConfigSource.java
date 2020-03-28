package factoryPattern.factory.entity;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *       源码来自于设计模式之美专栏
 *       类说明:使用工厂模式之前的代码
 */

public class RuleConfigSource {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		IRuleConfigParser parser = null;  //利用多态的特性，通过子类替换父类，在实际运行中调用子类对应的方法
		if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new JsonRuleConfigParser();
		} else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new XmlRuleConfigParser();
		} else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new YamlRuleConfigParser();
		} else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
			parser = new PropertiesRuleConfigParser();
		} else {
			System.out.println("Rule config file format is not supported: " + ruleConfigFilePath);
		}

		String configText = "";
		// 从ruleConfigFilePath文件中读取配置文本到configText中
		RuleConfig ruleConfig = parser.parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...解析文件名获取扩展名，比如rule.json，返回json
		return "json";
	}
}

package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.RuleConfig;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *
 *       类说明:使用简单工厂模式 如有新文件格式要进行解析，则只需要添加到如下else if分支，并创建该解析方式对应的解析工厂
 *       看如下该类感觉这跟原先的代码并无啥差别，但是如果对于创建对应解析的实体中包含复杂逻辑就大有用处。
 *       当然还可以对下面进行进一步的优化，如添加RuleConfigParserFactoryMap类也就是工厂的工厂类 小结：
 *       当创建对象是一个“大工程”的时候，我们一般会选择使用工厂模式，来封装对象复杂的创建过程，将对象的创建和使用分离，让代码更加清晰。
 *       那何为“大工程”呢？上一节课中我们讲了两种情况，一种是创建过程涉及复杂的 if-else
 *       分支判断，另一种是对象创建需要组装多个其他类对象或者需要复杂的初始化过程。
 */

public class RuleConfigSource {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		RuleConfigFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);

		String configText = "";
		// 从ruleConfigFilePath文件中读取配置文本到configText中
		RuleConfig ruleConfig = parserFactory.createParser().parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...解析文件名获取扩展名，比如rule.json，返回json
		return "json";
	}
}

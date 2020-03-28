package factoryPattern.factory.factoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *
 *       类说明，为优化工厂方法模式而创建的工厂的工厂类
 *       这样有添加新解析格式只需要往Map中添加该解析方式以及创建对应的解析工厂便可，调用者RuleConfigSource无需做任何修改
 */

public class RuleConfigParserFactoryMap {
	private static final Map<String, RuleConfigFactory> cachedFactories = new HashMap<String, RuleConfigFactory>();

	static {
		cachedFactories.put("json", new JsonRuleConfigParserFactory());
		cachedFactories.put("xml", new XmlRuleConfigParserFactory());
		cachedFactories.put("yaml", new YamlRuleConfigParserFactory());
		cachedFactories.put("properties", new PropertiesRuleConfigParserFactory());
	}

	public static RuleConfigFactory getParserFactory(String type) {
		if (type == null || type.isEmpty()) {
			return null;
		}
		RuleConfigFactory parserFactory = cachedFactories.get(type.toLowerCase());
		return parserFactory;
	}
}

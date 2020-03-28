package factoryPattern.factory.factoryMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵����Ϊ�Ż���������ģʽ�������Ĺ����Ĺ�����
 *       ����������½�����ʽֻ��Ҫ��Map����Ӹý�����ʽ�Լ�������Ӧ�Ľ���������ɣ�������RuleConfigSource�������κ��޸�
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

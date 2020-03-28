package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.RuleConfig;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵��:ʹ�ü򵥹���ģʽ
 *       �������ļ���ʽҪ���н�������ֻ��Ҫ��ӵ�����else if��֧���������ý�����ʽ��Ӧ�Ľ�������
 *       �����¸���о����ԭ�ȵĴ��벢��ɶ��𣬵���������ڴ�����Ӧ������ʵ���а��������߼��ʹ����ô���
 *       ��Ȼ�����Զ�������н�һ�����Ż��������RuleConfigParserFactoryMap��Ҳ���ǹ����Ĺ�����
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
		// ��ruleConfigFilePath�ļ��ж�ȡ�����ı���configText��
		RuleConfig ruleConfig = factory.createParser().parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...�����ļ�����ȡ��չ��������rule.json������json
		return "json";
	}
}

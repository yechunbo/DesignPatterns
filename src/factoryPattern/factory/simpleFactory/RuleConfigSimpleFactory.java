package factoryPattern.factory.simpleFactory;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.JsonRuleConfigParser;
import factoryPattern.factory.entity.PropertiesRuleConfigParser;
import factoryPattern.factory.entity.XmlRuleConfigParser;
import factoryPattern.factory.entity.YamlRuleConfigParser;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵�� ���򵥹���ģʽ�������µĽ�����ʽ����ʱ��
 *       ֻ��Ҫ��������createParser������Ӷ�Ӧ�Ľ����߼��Լ����һ���̳���IRuleConfigParser��Ľ����ø�ʽ�ļ�����
 *       �ŵ㣺���е�ҵ����붼�����ڹ������У������߼���
 *       ȱ�㣺��ҵ���ر��Ӻ󣬸ü򵥹����������ά���������ٴ����ö�̬���ԶԸù������г�ȡ��Ҳ���ǹ�������ģʽ��
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

package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.RuleConfig;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵��:ʹ�ü򵥹���ģʽ �������ļ���ʽҪ���н�������ֻ��Ҫ��ӵ�����else if��֧���������ý�����ʽ��Ӧ�Ľ�������
 *       �����¸���о����ԭ�ȵĴ��벢��ɶ��𣬵���������ڴ�����Ӧ������ʵ���а��������߼��ʹ����ô���
 *       ��Ȼ�����Զ�������н�һ�����Ż��������RuleConfigParserFactoryMap��Ҳ���ǹ����Ĺ����� С�᣺
 *       ������������һ�����󹤳̡���ʱ������һ���ѡ��ʹ�ù���ģʽ������װ�����ӵĴ������̣�������Ĵ�����ʹ�÷��룬�ô������������
 *       �Ǻ�Ϊ���󹤳̡��أ���һ�ڿ������ǽ������������һ���Ǵ��������漰���ӵ� if-else
 *       ��֧�жϣ���һ���Ƕ��󴴽���Ҫ��װ�����������������Ҫ���ӵĳ�ʼ�����̡�
 */

public class RuleConfigSource {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		RuleConfigFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);

		String configText = "";
		// ��ruleConfigFilePath�ļ��ж�ȡ�����ı���configText��
		RuleConfig ruleConfig = parserFactory.createParser().parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...�����ļ�����ȡ��չ��������rule.json������json
		return "json";
	}
}

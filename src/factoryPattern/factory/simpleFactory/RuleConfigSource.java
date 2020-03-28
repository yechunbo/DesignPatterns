package factoryPattern.factory.simpleFactory;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.RuleConfig;
/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵��:ʹ�ü򵥹���ģʽ
 */

public class RuleConfigSource {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		IRuleConfigParser parser = RuleConfigSimpleFactory.createParser(ruleConfigFileExtension);
		String configText = "";
		// ��ruleConfigFilePath�ļ��ж�ȡ�����ı���configText��
		RuleConfig ruleConfig = parser.parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...�����ļ�����ȡ��չ��������rule.json������json
		return "json";
	}
}

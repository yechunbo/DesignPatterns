package factoryPattern.factory.entity;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *       Դ�����������ģʽ֮��ר��
 *       ��˵��:ʹ�ù���ģʽ֮ǰ�Ĵ���
 */

public class RuleConfigSource {
	public RuleConfig load(String ruleConfigFilePath) {
		String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
		IRuleConfigParser parser = null;  //���ö�̬�����ԣ�ͨ�������滻���࣬��ʵ�������е��������Ӧ�ķ���
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
		// ��ruleConfigFilePath�ļ��ж�ȡ�����ı���configText��
		RuleConfig ruleConfig = parser.parse(configText);
		return ruleConfig;
	}

	private String getFileExtension(String filePath) {
		// ...�����ļ�����ȡ��չ��������rule.json������json
		return "json";
	}
}

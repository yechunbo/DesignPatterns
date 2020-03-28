package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.PropertiesRuleConfigParser;

/**
* @author YeChunBo
* @time 2020��3��13�� 
*
* ��˵�� 
*/

public class PropertiesRuleConfigParserFactory implements RuleConfigFactory {

	@Override
	public IRuleConfigParser createParser() {
		// TODO Auto-generated method stub
		return new PropertiesRuleConfigParser();
	}

}

package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.JsonRuleConfigParser;

/**
* @author YeChunBo
* @time 2020��3��13�� 
*
* ��˵�� 
*/

public class JsonRuleConfigParserFactory implements RuleConfigFactory {

	@Override
	public IRuleConfigParser createParser() {
		// TODO Auto-generated method stub
		return new JsonRuleConfigParser();
	}

}

package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.PropertiesRuleConfigParser;

/**
* @author YeChunBo
* @time 2020年3月13日 
*
* 类说明 
*/

public class PropertiesRuleConfigParserFactory implements RuleConfigFactory {

	@Override
	public IRuleConfigParser createParser() {
		// TODO Auto-generated method stub
		return new PropertiesRuleConfigParser();
	}

}

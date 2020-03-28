package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;
import factoryPattern.factory.entity.YamlRuleConfigParser;

/**
* @author YeChunBo
* @time 2020年3月13日 
*
* 类说明 
*/

public class YamlRuleConfigParserFactory implements RuleConfigFactory {

	@Override
	public IRuleConfigParser createParser() {
		// TODO Auto-generated method stub
		return new YamlRuleConfigParser();
	}

}

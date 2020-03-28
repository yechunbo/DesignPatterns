package factoryPattern.factory.entity;

/**
* @author YeChunBo
* @time 2020年3月13日 
*
* 类说明 
*/

public abstract class IRuleConfigParser {
	abstract public RuleConfig parse(String configText);
}

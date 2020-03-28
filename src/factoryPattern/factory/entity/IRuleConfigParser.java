package factoryPattern.factory.entity;

/**
* @author YeChunBo
* @time 2020��3��13�� 
*
* ��˵�� 
*/

public abstract class IRuleConfigParser {
	abstract public RuleConfig parse(String configText);
}

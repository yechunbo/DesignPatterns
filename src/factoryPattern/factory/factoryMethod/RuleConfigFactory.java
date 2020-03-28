package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;

/**
 * @author YeChunBo
 * @time 2020年3月13日
 *
 *       类说明 ：工厂方法模式，当有新的解析格式出现时，
 *       
 */

public interface RuleConfigFactory {

	IRuleConfigParser createParser();
}

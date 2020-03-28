package factoryPattern.factory.factoryMethod;

import factoryPattern.factory.entity.IRuleConfigParser;

/**
 * @author YeChunBo
 * @time 2020��3��13��
 *
 *       ��˵�� ����������ģʽ�������µĽ�����ʽ����ʱ��
 *       
 */

public interface RuleConfigFactory {

	IRuleConfigParser createParser();
}

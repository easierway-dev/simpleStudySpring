package cn.jjl.springframework;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jianjilong
 * @email 2594979588@qq.com
 * @date 2021/6/17 10:22
 */
public class BeanFactory {
    private Map<String,BeanDefinition> beanDefinitionMap   = new ConcurrentHashMap<String,BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name,BeanDefinition beanDefinition){
        beanDefinitionMap.put(name,beanDefinition);
    }
}

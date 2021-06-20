package cn.jjl.springframework;

/**
 * @author jianjilong
 * @email 2594979588@qq.com
 * @date 2021/6/17 10:19
 * Bean 的定义
 */
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean(){
        return bean;
    }
}

package cn.jjl.springframework.test;

import cn.jjl.springframework.BeanDefinition;
import cn.jjl.springframework.BeanFactory;
import cn.jjl.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * @author jianjilong
 * @email 2594979588@qq.com
 * @date 2021/6/17 10:44
 */
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化beanfactory
        BeanFactory beanFactory = new BeanFactory();
        // 2.注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}

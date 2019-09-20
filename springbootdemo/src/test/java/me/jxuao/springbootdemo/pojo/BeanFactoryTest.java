package me.jxuao.springbootdemo.pojo;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @program: MultiMavenModule
 * @description: beanfactory测试类
 * @author: camxu
 * @create: 2019-08-25 15:52
 **/
public class BeanFactoryTest {

    @Test
    public void testGetBean() throws Throwable {
        ResourcePatternResolver resourcePatternResolver = new PathMatchingResourcePatternResolver();
        Resource resource = resourcePatternResolver.getResource("classpath:beans.xml");
        System.out.println("description: " + resource.getDescription());
        System.out.println("filename: " + resource.getFilename());
        System.out.println("file: " + resource.getFile());
        System.out.println("uri: " + resource.getURI());
        System.out.println("url: " + resource.getURL());
        System.out.println("inputstream: " + resource.getInputStream());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(factory);
        xmlBeanDefinitionReader.loadBeanDefinitions(resource);

        Car car1 = factory.getBean("car1", Car.class);
        System.out.println(car1);

        MisunderstandedCar car2 = factory.getBean("car2", MisunderstandedCar.class);
        System.out.println(car2);

        Car car3 = factory.getBean("car3", Car.class);
        System.out.println(car3);
    }
}

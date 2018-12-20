package com.zhouwei.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
//        Category c = (Category) context.getBean("c");
//        System.out.println(c.getName());
//        System.out.println(c.getId());
        //System.out.println(c.getCategory().getName());
//        Product p = (Product) context.getBean("p");
//        System.out.println(p.getName());
//        System.out.println(p.getId());
//        p.setId(9);
//        System.out.println(p.getId());
//        System.out.println(p.getCategory().getName());
        ProductService service = (ProductService)context.getBean("s");
        service.doSomeService();
    }
}

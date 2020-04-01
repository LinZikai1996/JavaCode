package com.scb.drools.entity;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class OrderTest {

    @Test
    public void test(){
        KieServices kieServices = KieServices.Factory.get();
        //获得 kie 容器对象
        KieContainer kieContainer = kieServices.newKieClasspathContainer();
        //从容器中获得 kie 会话对象
        KieSession kieSession = kieContainer.newKieSession();

        // Fact 对象
        Order order = new Order();
        order.setOriginalPrice(500d);

        System.out.println(order);

        kieSession.insert(order);

        //激活规则
        kieSession.fireAllRules();

        //关闭 session
        kieSession.dispose();

        System.out.println(order);

    }
}

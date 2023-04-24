package siestageek.basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ApplicationObjectSupport;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import siestageek.beans.HelloSpring5Bean03;

public class HelloSpring5App06 {

    // 스프링 프레임워크 두번째 사례

    // BeanFactory가 아닌 ApplicationContext로
    // DI를 실행해 봄

    // 추가 라이브러리
    // spring-context
    // spring-expression
    // spring-aop

    public static void main(String[] args) {

        ApplicationContext ctx =
                new FileSystemXmlApplicationContext("src/bean05.xml");
        HelloSpring5Bean03 bean = null;

        bean = (HelloSpring5Bean03) ctx.getBean("kor");
        bean.sayHello("스프링 5");

        bean = (HelloSpring5Bean03) ctx.getBean("eng");
        bean.sayHello("Spring 5");

        bean = (HelloSpring5Bean03) ctx.getBean("jpn");
        bean.sayHello("スプリング 5");
    }
}
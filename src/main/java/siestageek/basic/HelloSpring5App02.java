package siestageek.basic;

import siestageek.beans.HelloSpring5Bean02;

public class HelloSpring5App02 {

    public static void main(String[] args) {
        HelloSpring5Bean02 bean = new HelloSpring5Bean02();

        bean.sayHelloKor("스프링 5");
        bean.sayHelloEng("Spring 5");
        bean.sayHelloJpn("スプリング 5");
    }
}
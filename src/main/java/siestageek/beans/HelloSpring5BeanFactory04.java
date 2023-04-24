package siestageek.beans;

public class HelloSpring5BeanFactory04 {

    // 인사말을 출력하는 객체를 생성하는 create 메서드
    public static HelloSpring5Bean03 create(String bean) {
        HelloSpring5Bean03 obj = null;

        if (bean.equalsIgnoreCase("kor"))
            obj = new HelloSpring5Bean03Kor();
        else if (bean.equalsIgnoreCase("eng"))
            obj = new HelloSpring5Bean03Eng();
        else if (bean.equalsIgnoreCase("jpn"))
            obj = new HelloSpring5Bean03Jpn();

        return obj;
    }
}
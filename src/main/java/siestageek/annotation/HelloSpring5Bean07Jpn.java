package siestageek.annotation;

import org.springframework.stereotype.Component;

@Component("jpn")

public class HelloSpring5Bean07Jpn implements HelloSpring5Bean07 {
    public void sayHello(String msg) {
        System.out.println("こんにちは. " + msg);
    }
}

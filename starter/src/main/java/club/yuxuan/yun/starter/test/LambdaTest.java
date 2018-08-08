package club.yuxuan.yun.starter.test;

import org.junit.Test;

/**
 * @description JDK8 Lambda Test
 *
 * @author yuxuan.han
 * @date 2018/7/31
 **/
public class LambdaTest {
    
    final static String str = "Hello ";
    
    @Test
    public void mainTest() {
        GreetingService greetingService = message -> {
            System.out.println(message);
            System.out.println(str + message);
        };
        greetingService.sayMessage("aaa");
        greetingService.sayMessage("bbb");

        TestService testService = (a, b, c) -> {
            System.out.println("a: " + a);
            System.out.println("b: " + b);
            System.out.println("c: " + c);
        };

        testService.methodA("1", "2", 3);
    }
    
    interface GreetingService {
        void sayMessage(String message);
    }
    
    interface TestService {
        void methodA(String a, String b, Integer c);
    }
    
}

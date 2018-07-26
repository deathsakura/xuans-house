package club.yuxuan.yun.model;

public class Java8Tester {
    
    final static String str = "Hello ";
    
    public static void main(String[] args) {
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

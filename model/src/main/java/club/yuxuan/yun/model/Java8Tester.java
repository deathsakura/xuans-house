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
    }
    
    interface GreetingService {
        void sayMessage(String message);
    }
    
}

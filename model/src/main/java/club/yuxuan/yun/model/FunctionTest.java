package club.yuxuan.yun.model;

import org.junit.jupiter.api.Test;

import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @description Lambda表达式的测试
 *
 * @author yuxuan.han
 * @date 2018/7/31
 **/
public class FunctionTest {

    public static void main(String[] args) {
        
    }
    
    @Test
    public void testPredicate() {
        String param = "a";
        Predicate<String> strStartPredicate = str -> str.startsWith(param);
        boolean b = strStartPredicate.test("abcd");
        System.out.println(b);
    }
    
    @Test
    public void testConsumer() {
        Consumer<String> messageConsumer = message -> System.out.println(message);
        messageConsumer.accept("club.yuxuan.yun.model.FunctionTest.testConsumer");
    }
    
    @Test
    public void testFunction() {
        Function<String, String> toUpperCaseFunction = string -> string.toUpperCase();
        String result = toUpperCaseFunction.apply("abcd_1234");
        System.out.println(result);
    }
    
    @Test
    public void testSupplier() {
        Supplier<String> uuidGeneratorSupplier = () -> UUID.randomUUID().toString();
        String uuid = uuidGeneratorSupplier.get();
        System.out.println(uuid);
    }
    
}

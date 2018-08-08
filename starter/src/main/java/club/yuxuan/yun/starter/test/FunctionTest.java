package club.yuxuan.yun.starter.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.function.*;

/**
 * @description JDK8 Function Test
 *
 * @author yuxuan.han
 * @date 2018/7/31
 **/
public class FunctionTest {

    /**
     * java.util.function.Predicate
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testPredicate() {
        String param = "a";
        Predicate<String> strStartPredicate = str -> str.startsWith(param);
        boolean b = strStartPredicate.test("abcd");
        System.out.println(b);
    }

    /**
     * java.util.function.Consumer
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testConsumer() {
        Consumer<String> messageConsumer = message -> System.out.println(message);
        messageConsumer.accept("club.yuxuan.yun.starter.test.FunctionTest.testConsumer");
    }

    /**
     * java.util.function.Function
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testFunction() {
        Function<String, String> toUpperCaseFunction = string -> string.toUpperCase();
        String result = toUpperCaseFunction.apply("abcd_1234");
        System.out.println(result);
    }

    /**
     * java.util.function.Supplier
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testSupplier() {
        Supplier<String> uuidGeneratorSupplier = () -> UUID.randomUUID().toString();
        String uuid = uuidGeneratorSupplier.get();
        System.out.println(uuid);
    }

    /**
     * 方法引用
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testMethod() {
        Function<String, Integer> strToLengthFunction = str -> str.length();
        Function<String, Integer> strToLengthFunction2 = String::length;
        System.out.println(strToLengthFunction.apply("abc"));
        System.out.println(strToLengthFunction2.apply("abcd"));
    }

    /**
     * 静态方法引用
     *
     * @author yuxuan.han
     * @date 2018/7/31
     * @return
     */
    @Test
    public void testStaticMethod() {
        Function<List<Integer>, Integer> maxFunction = (number) -> Collections.max(number);
        Function<List<Integer>, Integer> maxFunction2 = Collections::max;

        List<Integer> numbers = Arrays.asList(1, 5, 100, 9, 0);
        System.out.println(maxFunction.apply(numbers));
        System.out.println(maxFunction2.apply(numbers));
    }
    
    /**
     * 实例方法引用
     * 
     * @author yuxuan.han
     * @date 2018/7/31
     * @return 
     */
    @Test
    public void testObjectMethod() {
        BiFunction<String, String, String> concatFunction = String::concat;
        String concat = concatFunction.apply("abc", "123");
        System.out.println(concat);
    }
    
}
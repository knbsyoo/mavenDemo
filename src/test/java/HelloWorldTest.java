import com.bright.mavendemo.helloworld.HelloWorld;
import org.junit.Test;

public class HelloWorldTest {
    @Test
    public void test(){
        System.out.println(new HelloWorld().sayHello());
    }
}

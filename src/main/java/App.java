import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld tree =
                applicationContext.getBean(HelloWorld.class);
        HelloWorld leaf =
                applicationContext.getBean(HelloWorld.class);

        Cat one = applicationContext.getBean(Cat.class);
        Cat two = applicationContext.getBean(Cat.class);

        System.out.println(tree.equals(leaf));
        System.out.println(one.equals(two));
    }
}
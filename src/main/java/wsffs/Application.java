package wsffs;

import wsffs.springframework.app.UserController;
import wsffs.springframework.boot.web.servlet.context.AnnotationConfigServletWebServerApplicationContext;
import wsffs.springframework.context.ApplicationContext;

public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new AnnotationConfigServletWebServerApplicationContext();
        final UserController userController = context.getBean("userController", UserController.class);
        final String result = userController.getHello();
        System.out.println(result);
    }
}

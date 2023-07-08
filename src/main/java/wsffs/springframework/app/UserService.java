package wsffs.springframework.app;

import wsffs.springframework.beans.annotations.Component;

@Component
public class UserService {

    public String sayHello() {
        return "Hello";
    }
}

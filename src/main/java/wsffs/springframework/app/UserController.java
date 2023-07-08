package wsffs.springframework.app;

import wsffs.springframework.beans.annotations.Component;

@Component
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public String getHello() {
        return userService.sayHello();
    }
}

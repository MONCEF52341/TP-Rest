package emsi.moncef.tp_rest.controller;


import emsi.moncef.tp_rest.model.User;
import emsi.moncef.tp_rest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController( UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/user/{p}")
    public User getUser(@PathVariable("p") Integer id) {
        return userService.getUser(id);
    }
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getUserList();
    }
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @PutMapping("/update/{p}")
    public boolean UpdateUser(@PathVariable("p") Integer id, @RequestBody User user) {
        return userService.updateUser(id,user);
    }
    @DeleteMapping("/supp")
    public boolean DeleteUser( @RequestParam Integer id) {
        return userService.deleteUser(id);
    }
}


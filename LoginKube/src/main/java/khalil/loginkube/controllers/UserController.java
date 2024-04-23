package khalil.loginkube.controllers;


import khalil.loginkube.entities.Login;
import khalil.loginkube.entities.User;
import khalil.loginkube.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
    UserService userService;

    @PostMapping("/add-user")

    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }


    @GetMapping ("/get-user")
    public  User getUser(@PathVariable int id ){
        return userService.getUser(id);
    }
    @GetMapping ("/login")
    public String login(@RequestBody Login login){

        return userService.login(login.getEmail(),login.getPassword());
    }
    @GetMapping ("/get-users")
    public List<User> getAll(){

        return userService.getUsers();
    }




}

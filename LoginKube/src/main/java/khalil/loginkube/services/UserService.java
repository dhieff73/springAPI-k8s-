package khalil.loginkube.services;

import khalil.loginkube.entities.User;

import java.util.List;
import java.util.Set;

public interface UserService {

    User getUser(int iduser);


    User saveUser(User user);

    List<User> getUsers();

    User editUser(User user);


     void deleteUSer(User user);

     String login (String email, String pwd);


}

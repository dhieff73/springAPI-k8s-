package khalil.loginkube.services;

import khalil.loginkube.entities.User;
import khalil.loginkube.repositories.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{


    @Autowired
    private UserRepo userRepo;

    @Override
    public User getUser(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User editUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public void deleteUSer(User user) {
        userRepo.delete(user);
    }


    @Override
    public String login(String email, String pwd) {
            User user = userRepo.findUserByEmail(email);
            String message = null;
            if (user==null){
                message= "User not found !!";
            } else if (user.getPassword().equals(pwd)) {

                message= "Login succsessful for "+user.getName() ;
            }
            else {
                message="Incorrect Password !";
            }
            return message;

    }
}

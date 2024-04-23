package khalil.loginkube.repositories;

import khalil.loginkube.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
    User findUserByEmail(String email);

}

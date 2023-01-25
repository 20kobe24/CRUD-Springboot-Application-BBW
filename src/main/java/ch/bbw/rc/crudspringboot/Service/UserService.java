package ch.bbw.rc.crudspringboot.Service;

import ch.bbw.rc.crudspringboot.model.User;
import ch.bbw.rc.crudspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }


    public User getUserById(Long id){
        return userRepository.findById(id).orElse(null);

    }

    public User createUser(User user) {
        return userRepository.save(user);
    }
}

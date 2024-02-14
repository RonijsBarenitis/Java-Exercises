package co.develhope.UnitTests.services;

import co.develhope.UnitTests.entities.User;
import co.develhope.UnitTests.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User updateEmail(Long id, String email) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            user.get().setEmail(email);
            return userRepository.save(user.get());
        } else {
            return null;
        }
    }

    public User updateUserName(Long id, String newUserName) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){
            user.get().setUserName(newUserName);
            return userRepository.save(user.get());
        } else {
            return null;
        }
    }
}

package dio.dio_spring_security_jwt.service;

import dio.dio_spring_security_jwt.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import dio.dio_spring_security_jwt.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder encoder;
    public void createUser(User user) {
        String pass = user.getPassword();
        // Criptografando antes de salvar no bd
        user.setPassword(encoder.encode(pass));
        repository.save(user);
    }
}

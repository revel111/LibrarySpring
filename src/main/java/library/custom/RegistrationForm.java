package library.custom;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {
    private final String username;
    private final String password;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, password);
    }
}

package com.anil.jwtExample.Services;

import com.anil.jwtExample.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

    void save(User user);
}

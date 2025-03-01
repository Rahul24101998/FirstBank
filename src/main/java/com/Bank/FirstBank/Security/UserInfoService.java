package com.Bank.FirstBank.Security;

import com.Bank.FirstBank.Repository.UserRepository;
import com.Bank.FirstBank.Security.UserInfoUserDetails;
import com.Bank.FirstBank.Util.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;  // Repository for User



    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByName(username);
        return user.map(u -> {
            u.setPassword("{noop}" + u.getPassword()); // Prefix password with {noop}
            return new UserInfoUserDetails(u);
        }).orElseThrow(() -> new UsernameNotFoundException("User not found " + username));
    }
}

package com.Bank.FirstBank.Service.Impl;

import com.Bank.FirstBank.Repository.UserRepository;
import com.Bank.FirstBank.Service.UserService;
import com.Bank.FirstBank.Util.Dto.UserDTO;
import com.Bank.FirstBank.Util.Entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDTO addUser(UserDTO user) {
        User aveduser=userRepo.save(new ObjectMapper().convertValue(user, User.class));
        return new ObjectMapper().convertValue(aveduser, UserDTO.class);
    }

    @Override
    public UserDTO getUser(Long id) {

        Optional<User> userOptional = userRepo.findById(id);
        if (userOptional.isPresent()) {
            return UserDTO.builder().
                    id(userOptional.get().getId()).
                    name(userOptional.get().getName()).
                    email(userOptional.get().getEmail()).
                    role(userOptional.get().getRole()).
                    build();
        } else {
            return null;
        }
    }

    @Override
    public UserDTO updateUser(Long id, String email) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}

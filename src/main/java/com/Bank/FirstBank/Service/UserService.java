package com.Bank.FirstBank.Service;

import com.Bank.FirstBank.Util.Dto.UserDTO;
import com.Bank.FirstBank.Util.Entity.User;

public interface UserService {

    public UserDTO addUser(UserDTO user);
    public UserDTO findUserById(Long id);
    public UserDTO updateUser(Long id, String email);
    public void deleteUser(Long id);
}

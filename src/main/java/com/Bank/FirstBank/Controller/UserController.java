package com.Bank.FirstBank.Controller;


import com.Bank.FirstBank.Service.UserService;
import com.Bank.FirstBank.Util.Dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/details/{id}")
    ResponseEntity<UserDTO> getUser(@PathVariable("id") Long id) {
        UserDTO userDTO = userService.getUser(id);
        if (userDTO == null) {
            return ResponseEntity.notFound().build();
        }else{
            return  ResponseEntity.ok(userDTO);
        }
    }

    @PostMapping("/add")
    ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user) {
        UserDTO userDTO = userService.addUser(user);
        return ResponseEntity.ok(userDTO);
    }
}

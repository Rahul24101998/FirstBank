package com.Bank.FirstBank.Controller;


import com.Bank.FirstBank.Service.UserService;
import com.Bank.FirstBank.Util.Dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/User")
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/details/{id}")
    ResponseEntity<UserDTO> findById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.findUserById(id));

    }

    @PostMapping("/add")
    ResponseEntity<UserDTO> addUser(@RequestBody UserDTO user) {
        UserDTO userDTO = userService.addUser(user);
        return ResponseEntity.ok(userDTO);
    }
}

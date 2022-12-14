package com.katru.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.katru.api.entity.User;
import com.katru.api.service.UserService;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/users")
public class UserResource {

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{idUser}")
    public User findById(@PathVariable Long idUser){
        return userService.findById(idUser);
    }

    @GetMapping(params = {"page", "size"})
    public Page<User> list(@RequestParam("page") int page, @RequestParam("size") int size) {
        return userService.findAllPaginated(page, size);
    }

}

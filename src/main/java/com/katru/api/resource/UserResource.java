package com.katru.api.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.katru.api.entity.User;
import com.katru.api.resource.request.CreateUserRequest;
import com.katru.api.service.UserService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/users")
public class UserResource {

    private static final Logger LOG = LoggerFactory.getLogger(AuthResource.class);

    private final UserService userService;

    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{idUser}")
    public User findById(@PathVariable Long idUser){
        return userService.findById(idUser);
    }

    @GetMapping(params = {"page", "size"})
    public Page<User> list(
        @RequestParam("page") int page, 
        @RequestParam("size") int size
    ) {
        return userService.findAllPaginated(page, size);
    }

    @GetMapping(path = "/byName", params = {"page","size","userName"})
    public Slice<User> listByFirstName(
        @RequestParam("page") int page,
        @RequestParam("size") int size,
        @RequestParam("userName") String userName
    ) {
        return userService.findByFirstName(userName, page, size);
    }

    @PostMapping(path = "/create")
    public void createUser(@RequestBody CreateUserRequest createUserRequest) {
        LOG.debug("Create new user requested: '{}'", createUserRequest.name());
        // TODO: transform data to allign with database


        
    }

}

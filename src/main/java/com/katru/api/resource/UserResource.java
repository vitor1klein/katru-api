package com.katru.api.resource;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.katru.api.entity.User;
import com.katru.api.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping()
    public List<User> getUsers(){
        return userService.list();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public User getUserById(@PathVariable Long idUser) throws NotFoundException{
        return userService.findById(idUser);
    }
    
    // @PostMapping("/create")
    // public ResponseEntity<User> createUser(@RequestBody User newUser) throws ServerException {
    //     // User user = userService.save(newUser);
    //     if (user == null) {
    //         throw new ServerException(null);
    //     } else {
    //         return new ResponseEntity<>(user, HttpStatus.CREATED);
    //     }
    // }

    @GetMapping()
    public String getMethodName() {
        return "mudei";
    }


//     @RequestMapping(value = "/products/{id}", method = RequestMethod.PUT)
//     public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product) { 
//       if(!productRepo.containsKey(id))throw new ProductNotfoundException();
//       productRepo.remove(id);
//       product.setId(id);
//       productRepo.put(id, product);
//       return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
//    }
    
}

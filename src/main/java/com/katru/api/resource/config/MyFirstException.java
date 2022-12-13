package com.katru.api.resource.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MyFirstException extends RuntimeException {

    private Long idUser;

    public MyFirstException(Long idUser){
        this.idUser = idUser;
    }

    public MyFirstException(String arg0, Throwable arg1, Long idUser) {
        super(arg0, arg1);
        this.idUser = idUser;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }    

}


// @ControllerAdvice
// public class ProductExceptionController {
//     @ExceptionHandler(value = ProductNotfoundException.class)
//     public ResponseEntity<Object> exception(ProductNotfoundException exception) {
//       return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//    }
// }

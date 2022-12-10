package com.katru.api.resource.config;

public class MyFirstException extends Exception {

    public MyFirstException(String arg0) {
        super(arg0);
    }

}


// @ControllerAdvice
// public class ProductExceptionController {
//     @ExceptionHandler(value = ProductNotfoundException.class)
//     public ResponseEntity<Object> exception(ProductNotfoundException exception) {
//       return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
//    }
// }

package guru.springframwork.spring7restmvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

//@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity handlerNotFoundException(){

        System.out.println("In Exception Handler");
        return ResponseEntity.notFound().build();
    }
}

package com.ms.gittest2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gitTest")
public class MyController
{

    @RequestMapping( method = RequestMethod.GET ,path = "/test1" ,
                     produces = "application/json" )
    public ResponseEntity<?>  getname()
    {
        return  ResponseEntity
                .status(HttpStatus.OK)
                .header("custom","Hello World")
                .body("This is CICD Pipeline testing..");



    }

}

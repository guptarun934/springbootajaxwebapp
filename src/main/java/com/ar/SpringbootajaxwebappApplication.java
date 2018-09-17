package com.ar;

import com.ar.model.Demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootajaxwebappApplication {

    public static void main (String[] args) {
        SpringApplication.run(SpringbootajaxwebappApplication.class, args);
    }
    @RequestMapping(value = "/getData",method = RequestMethod.GET)
    public ResponseEntity<Object> getData(){
        Demo demo = new Demo();
        demo.setId("1");
        demo.setName("arun");
        return new ResponseEntity<>(demo,HttpStatus.OK);
    }
    @RequestMapping(value = "/addData",method = RequestMethod.POST)
    public ResponseEntity<Object> addData(@RequestBody Demo demo){
        System.out.println("demo Id"+demo.getId());
        System.out.println("demo Name"+demo.getName());
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
}

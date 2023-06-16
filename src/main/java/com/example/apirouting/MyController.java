/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.GetMapping;
 * import org.springframework.web.bind.annotation.RestController;
 * 
 */

// Write your code here.
package com.example.apirouting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    private MyService myService;

    public MyController(MyService myService){
        this.myService = myService;
    }

    @GetMapping("/")
    public String home(){
        return myService.getHomePage();
    }

    @GetMapping("/about")
    public String about(){
        return myService.getAboutPage();
    }
}
package com.example.GetApiandMailIntegrationApplication;


import org.geekster.MailHandler;
import org.geekster.Sub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private MyObject myObject;


    public static Sub email;


    @GetMapping("objects")
    public String getObjects() {
        // Use the created objects
        myObject= new MyObject("Rahul",24);
        String myObjectAsString = myObject.toString();
        email = new Sub();
        // Send the objects as strings via email
        email.setSub(myObjectAsString);
        MailHandler mailHandler = new MailHandler();

        mailHandler.sendMail();
        return myObjectAsString;
    }
}
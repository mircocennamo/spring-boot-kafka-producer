package com.avanade.producer.resource;

import com.avanade.model.User;
import com.avanade.producer.Sender;
import com.avanade.producer.SenderAsyncCallBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author mirco.cennamo on 20/10/2023
 * @project spring-boot-kafka-producer
 */
@RestController
@RequestMapping("avanade")
public class UserResource {

    private static final String TOPIC = "exampletopic";
    @Autowired
    private Sender sender;
    @Autowired
    private SenderAsyncCallBack senderAsyncCallBack;

    @PostMapping(path = "/publish/newUser")
    public ResponseEntity<User> create(@RequestBody User newUser) {
        sender.sendMessage(newUser,TOPIC);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }

    @PostMapping(path = "/publish/newUserCallBack")
    public ResponseEntity<User> createCallBack(@RequestBody User newUser) {
        senderAsyncCallBack.sendMessage(newUser,TOPIC);
        return new ResponseEntity<>(newUser, HttpStatus.OK);
    }


}

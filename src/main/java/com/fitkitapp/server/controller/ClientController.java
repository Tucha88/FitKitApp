package com.fitkitapp.server.controller;

import com.fitkitapp.server.models.Client;
import com.fitkitapp.server.service.ClientService;
import com.fitkitapp.server.settings.errors.InvalidRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created on 06.08.2017
 * Controller for Client class
 *
 * @author boris
 */
@RestController
@CrossOrigin
@RequestMapping("client")
public class ClientController {


    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("/register")
    public ResponseEntity<Object> registerClient(@RequestBody @Valid Client client, BindingResult errors) {
        if (errors.hasErrors()) {
            throw new InvalidRequestException("Username already exists", errors);
        }
        return new ResponseEntity<Object>("{\"token\":" + "\"" + clientService.registerNewClient(client) + "\"}", HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Object> login(@RequestBody Client client, BindingResult errors) {
        String token = clientService.loginClient(client);
        if (token == null) {
            return new ResponseEntity<Object>("Wrong login or password", HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>("{\"token\":" + "\"" + token + "\"}", HttpStatus.OK);
    }

    @GetMapping("user")
    public ResponseEntity<Object> getUser(@RequestHeader("Authorization") String s) {
        return new ResponseEntity<Object>(clientService.getUser(s), HttpStatus.OK);
    }
}

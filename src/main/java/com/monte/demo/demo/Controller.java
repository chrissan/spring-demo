package com.monte.demo.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monte.demo.model.Message;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class Controller {
    @GetMapping("/version")
    public ResponseEntity<Message> getMessage() {
        Message message = new Message("MiAplicacion", "1.2", "Operación exitosa");
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Monte-Header", "OAuth");

        return new ResponseEntity<>(message, headers, HttpStatus.CREATED);  // Devuelve un 201 Created con encabezados personalizados
    }
    
}

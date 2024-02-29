package io.github.kitsf0x.bigchatbackend.controller;

import org.springframework.web.bind.annotation.RestController;

import io.github.kitsf0x.bigchatbackend.dto.MessageDto;
import io.github.kitsf0x.bigchatbackend.service.IMessageService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class MessageController {
    @Autowired
    private IMessageService messageService;

    @PostMapping("/messages")
    public ResponseEntity<MessageDto> storeMessage(@RequestBody MessageDto messageDto) {
        return ResponseEntity.ok(messageService.save(messageDto));
    }

    @GetMapping("/messages")
    public ResponseEntity<List<MessageDto>> listMessages() {
        return ResponseEntity.ok(messageService.getMessages());
    }

}

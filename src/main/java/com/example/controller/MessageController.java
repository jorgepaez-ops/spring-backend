package com.example.controller;

import com.example.entity.Message;
import com.example.repository.MessageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*")
public class MessageController {

    private final MessageRepository repository;

    public MessageController(MessageRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Message> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Message create(@RequestBody Message message) {
        return repository.save(message);
    }
}

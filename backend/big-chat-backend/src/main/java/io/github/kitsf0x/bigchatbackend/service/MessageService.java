package io.github.kitsf0x.bigchatbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kitsf0x.bigchatbackend.dto.MessageDto;
import io.github.kitsf0x.bigchatbackend.mapper.MessageMapper;
import io.github.kitsf0x.bigchatbackend.model.Message;
import io.github.kitsf0x.bigchatbackend.repository.MessageRepository;

@Service
public class MessageService implements IMessageService {
    @Autowired
    private MessageRepository messageRepository;
    private MessageMapper messageMapper = new MessageMapper();

    @Override
    public MessageDto save(MessageDto messageDto) {
        Message message = messageMapper.MessageDtoToMessage(messageDto);
        return messageMapper.MessageToMessageDto(messageRepository.save(message));
    }

    @Override
    public List<MessageDto> getMessages() {
        List<Message> messages = messageRepository.findAll();
        List<MessageDto> messageDtos = new ArrayList<>();
        for (Message message : messages) {
            messageDtos.add(messageMapper.MessageToMessageDto(message));
        }
        return messageDtos;
    }

}

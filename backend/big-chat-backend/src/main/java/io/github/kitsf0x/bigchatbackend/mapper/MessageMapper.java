package io.github.kitsf0x.bigchatbackend.mapper;

import io.github.kitsf0x.bigchatbackend.dto.MessageDto;
import io.github.kitsf0x.bigchatbackend.model.Message;

public class MessageMapper {
    public Message MessageDtoToMessage(MessageDto messageDto) {
        Message message = new Message();
        message.setId(messageDto.getId());
        message.setContent(messageDto.getContent());
        message.setCreatedAt(messageDto.getCreatedAt());
        message.setUpdatedAt(messageDto.getUpdatedAt());
        return message;
    }

    public MessageDto MessageToMessageDto(Message message) {
        MessageDto messageDto = new MessageDto();
        messageDto.setId(message.getId());
        messageDto.setContent(message.getContent());
        messageDto.setCreatedAt(message.getCreatedAt());
        messageDto.setUpdatedAt(message.getUpdatedAt());
        return messageDto;
    }
}

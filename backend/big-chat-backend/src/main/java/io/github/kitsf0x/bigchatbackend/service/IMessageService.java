package io.github.kitsf0x.bigchatbackend.service;

import java.util.List;

import io.github.kitsf0x.bigchatbackend.dto.MessageDto;

public interface IMessageService {
    MessageDto save(MessageDto messageDto);

    List<MessageDto> getMessages();
}

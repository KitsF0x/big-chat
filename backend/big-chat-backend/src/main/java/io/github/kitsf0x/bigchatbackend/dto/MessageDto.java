package io.github.kitsf0x.bigchatbackend.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MessageDto {
    private long id;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

package io.github.kitsf0x.bigchatbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.kitsf0x.bigchatbackend.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {

}

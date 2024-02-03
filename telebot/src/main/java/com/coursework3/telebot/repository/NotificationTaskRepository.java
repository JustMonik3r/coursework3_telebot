package com.coursework3.telebot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.coursework3.telebot.entity.NotificationTask;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationTaskRepository extends JpaRepository<NotificationTask, Long> {

    //Создаем репозиторий в БД для хранения полученных сообщений
    List<NotificationTask> findAllByExecDate(LocalDateTime localDateTime);
}
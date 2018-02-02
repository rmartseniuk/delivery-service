package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.Notification;
import com.epam.martseniuk.dto.Priority;
import com.epam.martseniuk.entity.NotificationEntity;

import java.util.List;

/**
 * @author Roman_Martseniuk
 */
public interface NotificationService {

    NotificationEntity save(Notification dto);

    List<NotificationEntity> findByPriority(Priority priority);
}

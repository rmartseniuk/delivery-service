package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.Notification;
import com.epam.martseniuk.dto.Priority;
import com.epam.martseniuk.entity.NotificationEntity;
import com.epam.martseniuk.repository.NotificationRepository;
import com.epam.martseniuk.service.NotificationService;
import lombok.Setter;
import org.springframework.core.convert.ConversionService;

import java.util.List;

/**
 * @author Roman_Martseniuk
 */
@Setter
public class NotificationServiceImpl implements NotificationService {

    private ConversionService conversionService;
    private NotificationRepository notificationRepository;

    @Override
    public NotificationEntity save(Notification notification) {
        NotificationEntity entity = conversionService.convert(notification, NotificationEntity.class);
        return notificationRepository.save(entity);
    }

    @Override
    public List<NotificationEntity> findByPriority(Priority priority) {
        return notificationRepository.findByPriority(priority.getText());
    }
}

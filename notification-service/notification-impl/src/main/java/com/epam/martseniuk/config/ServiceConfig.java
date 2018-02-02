package com.epam.martseniuk.config;

import com.epam.martseniuk.repository.NotificationRepository;
import com.epam.martseniuk.service.NotificationService;
import com.epam.martseniuk.service.impl.NotificationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;

/**
 * @author Roman_Martseniuk
 */
@Configuration
public class ServiceConfig {

    @Bean
    public NotificationService notificationService(ConversionService conversionService,
                                                   NotificationRepository notificationRepository) {
        NotificationServiceImpl notificationService = new NotificationServiceImpl();
        notificationService.setConversionService(conversionService);
        notificationService.setNotificationRepository(notificationRepository);
        return notificationService;
    }
}

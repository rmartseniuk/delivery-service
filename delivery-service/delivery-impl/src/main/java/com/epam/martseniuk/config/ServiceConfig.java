package com.epam.martseniuk.config;

import com.epam.martseniuk.repository.DeliveryPackageRepository;
import com.epam.martseniuk.repository.DeliveryStatusRepository;
import com.epam.martseniuk.service.DeliveryService;
import com.epam.martseniuk.service.impl.DeliveryServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Roman_Martseniuk
 */
@Configuration
public class ServiceConfig {

    @Bean
    DeliveryService deliveryService(DeliveryPackageRepository deliveryPackageRepository,
                                    DeliveryStatusRepository deliveryStatusRepository) {
        DeliveryServiceImpl deliveryService = new DeliveryServiceImpl();
        deliveryService.setDeliveryPackageRepository(deliveryPackageRepository);
        deliveryService.setDeliveryStatusRepository(deliveryStatusRepository);
        return deliveryService;
    }

}

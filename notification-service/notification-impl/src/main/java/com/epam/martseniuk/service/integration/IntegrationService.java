package com.epam.martseniuk.service.integration;

import com.epam.martseniuk.dto.Notification;

/**
 * @author Roman_Martseniuk
 */
public interface IntegrationService {

    void sendMessage(Notification notification);

}

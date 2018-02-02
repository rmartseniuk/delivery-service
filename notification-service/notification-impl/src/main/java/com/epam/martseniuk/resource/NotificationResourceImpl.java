package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Notification;
import com.epam.martseniuk.dto.Response;
import com.epam.martseniuk.dto.Status;
import com.epam.martseniuk.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class NotificationResourceImpl implements NotificationResource {

    @Autowired
    private NotificationService notificationService;

    @Override
    public Response send(@RequestBody Notification notification) {
        notificationService.save(notification);
        return new Response(LocalDateTime.now(), Status.PENDING);
    }
}

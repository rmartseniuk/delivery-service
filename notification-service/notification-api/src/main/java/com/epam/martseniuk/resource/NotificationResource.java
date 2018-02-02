package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.Notification;
import com.epam.martseniuk.dto.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Roman_Martseniuk
 */
@RequestMapping("/notification")
public interface NotificationResource {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    Response send(@RequestBody Notification notification);
}

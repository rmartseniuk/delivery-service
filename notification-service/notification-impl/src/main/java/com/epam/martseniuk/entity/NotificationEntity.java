package com.epam.martseniuk.entity;

import com.epam.martseniuk.dto.Channel;
import com.epam.martseniuk.dto.Status;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Roman_Martseniuk
 */
@Document(collection = "notification")
public class NotificationEntity {

    @Id
    private String id;
    private String type;
    private Channel channel;
    private String recipient;
    private String subject;
    private String text;
    private Status status;
}

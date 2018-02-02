package com.epam.martseniuk.dto;

import lombok.Data;

/**
 * @author Roman_Martseniuk
 */
@Data
public class Notification {

    private String type;
    private Channel channel;
    private String recipient;
    private String subject;
    private String text;
    private Status status;
}

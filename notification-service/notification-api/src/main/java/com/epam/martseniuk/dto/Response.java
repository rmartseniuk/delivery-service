package com.epam.martseniuk.dto;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author Roman_Martseniuk
 */
@AllArgsConstructor
public class Response {

    private LocalDateTime timestamp;
    private Status status;
}

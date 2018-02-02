package com.epam.martseniuk.dto;

import lombok.Getter;

/**
 * @author Roman_Martseniuk
 */
@Getter
public enum Status {

    PENDING("pending"), ENQUEUED("enqueued"), SENT("sent"), FAILED("failed");

    private final String text;

    Status(String text) {
        this.text = text;
    }
}

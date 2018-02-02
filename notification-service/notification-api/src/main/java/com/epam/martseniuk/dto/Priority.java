package com.epam.martseniuk.dto;

import lombok.Getter;

/**
 * @author Roman_Martseniuk
 */
@Getter
public enum Priority {

    REAL_TIME("realtime");

    private final String text;

    Priority(String text) {
        this.text = text;
    }
}

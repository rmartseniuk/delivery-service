package com.epam.martseniuk.dto;

/**
 * @author Roman_Martseniuk
 */
public enum Status {

    OPEN("open"),
    IN_PROGRESS("in progress"),
    VERIFIED("verified"),
    CLOSED("closed");

    private String description;

    Status(String description) {
        this.description = description;
    }
}

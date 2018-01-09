package com.epam.martseniuk.dto;

/**
 * @author Roman_Martseniuk
 */
public enum Status {

    IN_SENDER_DEPARTMENT("In the sender department"),
    IN_PROGRESS("In the way"),
    IN_RECEIVER_DEPARTMENT("In the receiver department"),
    PACKAGE_RECEIVED("Package received.");

    private String description;

    Status(String description) {
        this.description = description;
    }
}

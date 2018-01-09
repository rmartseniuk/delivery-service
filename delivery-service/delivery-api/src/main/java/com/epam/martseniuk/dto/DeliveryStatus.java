package com.epam.martseniuk.dto;

import lombok.Data;

/**
 * @author Roman_Martseniuk
 */
@Data
public class DeliveryStatus {

    private String currentLocation;
    private Status status;
}

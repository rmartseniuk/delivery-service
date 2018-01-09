package com.epam.martseniuk.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Roman_Martseniuk
 */
@Document(collection ="couriers")
public class Courier {

    @Id
    private String phoneNumber;

    private String username;

    private String fullName;

    private int age;

    private boolean hasCar;
}

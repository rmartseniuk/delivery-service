package com.epam.martseniuk.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Roman_Martseniuk
 */
@Document(collection = "clients")
public class Client {

    @Id
    private String phoneNumber;

    private String username;

    private String email;

    private String fullName;
}

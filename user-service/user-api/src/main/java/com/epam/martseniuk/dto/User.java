package com.epam.martseniuk.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Roman_Martseniuk
 */
@Document(collection = "users")
@Data
public class User {

    @Id
    private String username;

    private String password;
}


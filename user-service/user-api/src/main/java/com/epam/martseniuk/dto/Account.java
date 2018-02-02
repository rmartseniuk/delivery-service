package com.epam.martseniuk.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @author Roman_Martseniuk
 */
@Document(collection = "accounts")
@Data
public class Account {

    @Id
    private String username;
    private String fullName;
    private String email;
    private String phoneNumber;
    private List<String> assignedTasks;
    private List<String> reporterTasks;
}

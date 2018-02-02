package com.epam.martseniuk.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

/**
 * @author Roman_Martseniuk
 */
@Data
@Document(collection = "task")
public class Task {

    @Id
    private String taskId;
    @JsonProperty(required = true)
    private String assigneeId;
    @JsonProperty(required = true)
    private String reporterId;

    private String type;
    private Status status;
    private String description;

    private LocalDateTime createdDate;
    private LocalDateTime resolvedDate;
}

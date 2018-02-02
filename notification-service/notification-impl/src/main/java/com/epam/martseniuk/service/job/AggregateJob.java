package com.epam.martseniuk.service.job;

import com.epam.martseniuk.entity.NotificationEntity;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Roman_Martseniuk
 */
@Data
public class AggregateJob {

    private LocalDateTime executionDate;
    private NotificationEntity notificationEntity;
}

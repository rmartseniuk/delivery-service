package com.epam.martseniuk.service.schedule;

import com.epam.martseniuk.entity.NotificationEntity;
import com.epam.martseniuk.service.job.AggregateJob;

import java.time.LocalDateTime;

/**
 * @author Roman_Martseniuk
 */
public class AggregateJobFactory {

    public AggregateJob create(NotificationEntity notificationEntity) {
        AggregateJob aggregateJob = new AggregateJob();
        aggregateJob.setExecutionDate(LocalDateTime.now());
        aggregateJob.setNotificationEntity(notificationEntity);
        return aggregateJob;
    }

}

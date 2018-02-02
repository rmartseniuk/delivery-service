package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.Priority;
import com.epam.martseniuk.service.NotificationService;
import com.epam.martseniuk.service.job.AggregateJob;
import com.epam.martseniuk.service.schedule.AggregateJobFactory;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Roman_Martseniuk
 */
public class AggregateServiceImpl {

    private NotificationService notificationService;
    private AggregateJobFactory aggregateJobFactory;

    public List<AggregateJob> collectByRealtimePriority() {
        return notificationService.findByPriority(Priority.REAL_TIME).stream()
                .map(aggregateJobFactory::create)
                .collect(Collectors.toList());
    }
}

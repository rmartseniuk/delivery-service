package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.Courier;
import com.epam.martseniuk.repository.CourierRepository;
import com.epam.martseniuk.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Roman_Martseniuk
 */
@Service
public class CourierServiceImpl implements CourierService {

    @Autowired
    private CourierRepository courierRepository;

    @Override
    public Courier createCourier(Courier courier) {
        return courierRepository.save(courier);
    }

    @Override
    public Courier getCourierById(String id) {
        return courierRepository.findOne(id);
    }
}

package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.Courier;

/**
 * @author Roman_Martseniuk
 */
public interface CourierService {

    Courier createCourier(Courier courier);

    Courier getCourierById(String id);
}

package com.epam.martseniuk.controller;

import com.epam.martseniuk.dto.Courier;
import com.epam.martseniuk.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Roman_Martseniuk
 */
@RestController
public class CourierController {

    @Autowired
    private CourierService courierService;

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Courier getUserById(@PathVariable(value = "id") String id) {
        return courierService.getCourierById(id);
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public Courier createNewUser(@RequestBody Courier courier) {
        return courierService.createCourier(courier);
    }
}

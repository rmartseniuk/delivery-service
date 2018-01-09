package com.epam.martseniuk.resource;

import com.epam.martseniuk.dto.DeliveryPackage;
import com.epam.martseniuk.dto.DeliveryStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roman_Martseniuk
 */

public interface DeliveryResource {

    @RequestMapping(value = "/shipment/create", method = RequestMethod.POST, consumes = "application/json")
    DeliveryPackage createShipment(DeliveryPackage deliveryPackage);

    @RequestMapping(value = "/status/{id}", method = RequestMethod.GET, consumes = "application/json")
    DeliveryStatus getInfoStatus(@PathVariable(value = "id") String shipmentId);
}

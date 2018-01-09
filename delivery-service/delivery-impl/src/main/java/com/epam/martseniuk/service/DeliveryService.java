package com.epam.martseniuk.service;

import com.epam.martseniuk.dto.DeliveryPackage;
import com.epam.martseniuk.dto.DeliveryStatus;

/**
 * @author Roman_Martseniuk
 */
public interface DeliveryService {

    DeliveryPackage createShipment(DeliveryPackage deliveryPackage);

    DeliveryStatus getInfoStatus(String shipmentId);
}

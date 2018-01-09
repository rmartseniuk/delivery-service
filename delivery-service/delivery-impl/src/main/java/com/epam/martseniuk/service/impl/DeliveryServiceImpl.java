package com.epam.martseniuk.service.impl;

import com.epam.martseniuk.dto.DeliveryPackage;
import com.epam.martseniuk.dto.DeliveryStatus;
import com.epam.martseniuk.repository.DeliveryPackageRepository;
import com.epam.martseniuk.repository.DeliveryStatusRepository;
import com.epam.martseniuk.service.DeliveryService;
import lombok.Setter;

/**
 * @author Roman_Martseniuk
 */
@Setter
public class DeliveryServiceImpl implements DeliveryService {

    private DeliveryPackageRepository deliveryPackageRepository;
    private DeliveryStatusRepository deliveryStatusRepository;

    @Override
    public DeliveryPackage createShipment(DeliveryPackage deliveryPackage) {
        return deliveryPackageRepository.save(deliveryPackage);
    }

    @Override
    public DeliveryStatus getInfoStatus(String shipmentId) {
        return deliveryStatusRepository.findOne(shipmentId);
    }
}

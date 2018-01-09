package com.epam.martseniuk.dto;

import lombok.Data;

/**
 * @author Roman_Martseniuk
 */
@Data
public class DeliveryPackage {

    private String senderFullName;
    private String senderAddress;
    private String senderPhoneNumber;
    private String receiverFullName;
    private String receiverAddress;
    private String receiverPhoneNumber;
    private String costDelivery;



}

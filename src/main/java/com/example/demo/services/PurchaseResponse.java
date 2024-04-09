package com.example.demo.services;

import lombok.Getter;
import lombok.Setter;
import lombok.Data;

@Data
@Getter
@Setter
public class PurchaseResponse {

    private final String orderTrackingNumber;

}

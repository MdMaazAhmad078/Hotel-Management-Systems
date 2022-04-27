package com.example.hotel.payment.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.hotel.payment.Entity.PaymentEntity;


public interface PaymentRepository  extends CrudRepository<PaymentEntity, Integer> {

}

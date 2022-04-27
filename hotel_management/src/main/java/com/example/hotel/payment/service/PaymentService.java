package com.example.hotel.payment.service;

import java.util.List;

import com.example.hotel.payment.bean.PaymentBean;

public interface PaymentService {
	public PaymentBean createPayment(PaymentBean paymentBean);
	public PaymentBean getPaymentById(int id);
	public List<PaymentBean> getListOfPaymentList();
	public void deletePaymentById(int id);

}

package com.example.hotel.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.payment.bean.PaymentBean;
import com.example.hotel.payment.service.PaymentService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/Controller")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	
	@PostMapping(value="/CreatePayment")
	public void createPayment(@RequestBody PaymentBean paymentBean)
	{
		paymentService.createPayment(paymentBean);
	}
	
	@DeleteMapping(value="/DeletePayment/{id}")
	public void deletePaymentbyId(@PathVariable("id") int id) {
		 paymentService.deletePaymentById(id);
	}
	
	@PostMapping(value="GetPaymentByID/{id}")
	public PaymentBean getPaymentbyId(@PathVariable("id") int id)
	{
		return paymentService.getPaymentById(id);
	}
	
	@GetMapping(value=" GetListOfPayment")
	public List<PaymentBean> getListOfPaymentList()
	{
		return paymentService.getListOfPaymentList();
	}

}

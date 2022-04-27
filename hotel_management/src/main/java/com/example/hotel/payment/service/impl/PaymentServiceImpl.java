package com.example.hotel.payment.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.payment.Entity.PaymentEntity;
import com.example.hotel.payment.bean.PaymentBean;
import com.example.hotel.payment.repository.PaymentRepository;
import com.example.hotel.payment.service.PaymentService;
@Service
public class PaymentServiceImpl  implements PaymentService {
	
	@Autowired
	private PaymentRepository paymentRepository;
	
	@Override
	public PaymentBean createPayment(PaymentBean paymentbean)
	{
		PaymentEntity paymentEntity= null;
		if(paymentbean!=null)
		{
			paymentEntity = new PaymentEntity();
			BeanUtils.copyProperties(paymentbean, paymentEntity);
			paymentRepository.save(paymentEntity);
		}
		if(paymentEntity!=null)
		{
			paymentbean = new PaymentBean();
			BeanUtils.copyProperties(paymentEntity, paymentbean);
			return paymentbean;
		}
		return null;
	}
	
	@Override
	public void deletePaymentById(int id)
	{
		if(id!=0)
		{
			paymentRepository.deleteById(id);
		}
	}
	
	@Override
	public PaymentBean getPaymentById(int id) {
		PaymentBean paymentbean = new PaymentBean();
		Optional<PaymentEntity> paymentEntity = paymentRepository.findById(id);
	
		if(paymentEntity != null && !"".equals(paymentEntity))
		BeanUtils.copyProperties(paymentEntity.get(), paymentbean);
		return paymentbean;
	}
	
	@Override
	public List<PaymentBean> getListOfPaymentList() {
		List<PaymentEntity> listOfPaymentEntity = (List<PaymentEntity>) paymentRepository.findAll();
		List<PaymentBean> listOfPaymentBean = null;
		if(listOfPaymentEntity!=null && !listOfPaymentEntity.isEmpty()) {
			listOfPaymentBean = new ArrayList();
			for(PaymentEntity paymentEntity :listOfPaymentEntity) {
				PaymentBean paymentbean = new PaymentBean();
				BeanUtils.copyProperties(paymentEntity, paymentbean);
				listOfPaymentBean.add(paymentbean);
			}
		}
		return listOfPaymentBean;
	}



}

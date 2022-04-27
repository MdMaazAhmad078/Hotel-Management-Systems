package com.example.hotel.payment.bean;

import java.time.LocalDateTime;


public class PaymentBean {
	
	private int paymentId;
	private int guestId;
	private float amount;
	private String paid;
	private String invoice;
	private LocalDateTime payTime;
	private String cancelled;
	
	public PaymentBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentBean(int paymentId, int guestId, float amount, String paid, String invoice, LocalDateTime payTime,
			String cancelled) {
		super();
		this.paymentId = paymentId;
		this.guestId = guestId;
		this.amount = amount;
		this.paid = paid;
		this.invoice = invoice;
		this.payTime = payTime;
		this.cancelled = cancelled;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getGuestId() {
		return guestId;
	}

	public void setGuestId(int guestId) {
		this.guestId = guestId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public LocalDateTime getPayTime() {
		return payTime;
	}

	public void setPayTime(LocalDateTime payTime) {
		this.payTime = payTime;
	}

	public String getCancelled() {
		return cancelled;
	}

	public void setCancelled(String cancelled) {
		this.cancelled = cancelled;
	}
	

}

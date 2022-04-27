package com.example.hotel.payment.Entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT")
public class PaymentEntity {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Payment_id")
	private int paymentId;

	@Column(name="Guest_id")
	private int guestId;
	
	@Column(name="Amount")
	private float amount;
	
	@Column(name="Paid")
	private String paid;
	
	@Column(name="Invoice")
	private String invoice;
	
	@Column(name="PayTime")
	private LocalDateTime payTime;
	
	@Column(name="Cancelled")
	private String cancelled;

	public PaymentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentEntity(int paymentId, int guestId, float amount, String paid, String invoice, LocalDateTime payTime,
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

package com.example.FoodFly.enitity;

import java.time.Instant;
import jakarta.persistence.*;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class FoodOrders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    private Double totalAmount;
    private String orderStatus;
    private String paymentStatus;

    private Long customerId;

    private String razorpayOrderId;
    private String razorpayPaymentId;
    private String razorpaySignature;

    @CreatedDate
    private Instant createdDate;

    @LastModifiedDate
    private Instant updatedDate;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getRazorpayOrderId() {
		return razorpayOrderId;
	}

	public void setRazorpayOrderId(String razorpayOrderId) {
		this.razorpayOrderId = razorpayOrderId;
	}

	public String getRazorpayPaymentId() {
		return razorpayPaymentId;
	}

	public void setRazorpayPaymentId(String razorpayPaymentId) {
		this.razorpayPaymentId = razorpayPaymentId;
	}

	public String getRazorpaySignature() {
		return razorpaySignature;
	}

	public void setRazorpaySignature(String razorpaySignature) {
		this.razorpaySignature = razorpaySignature;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public Instant getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Instant updatedDate) {
		this.updatedDate = updatedDate;
	}

	@Override
	public String toString() {
		return "FoodOrders [orderId=" + orderId + ", totalAmount=" + totalAmount + ", orderStatus=" + orderStatus
				+ ", paymentStatus=" + paymentStatus + ", customerId=" + customerId + ", razorpayOrderId="
				+ razorpayOrderId + ", razorpayPaymentId=" + razorpayPaymentId + ", razorpaySignature="
				+ razorpaySignature + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}

	public FoodOrders(Long orderId, Double totalAmount, String orderStatus, String paymentStatus, Long customerId,
			String razorpayOrderId, String razorpayPaymentId, String razorpaySignature, Instant createdDate,
			Instant updatedDate) {
		super();
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.orderStatus = orderStatus;
		this.paymentStatus = paymentStatus;
		this.customerId = customerId;
		this.razorpayOrderId = razorpayOrderId;
		this.razorpayPaymentId = razorpayPaymentId;
		this.razorpaySignature = razorpaySignature;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public FoodOrders() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    // getters & setters
}
package com.example.hotwaxLast.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderHeader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    private Date orderDate;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "shipping_contact_mech_id", nullable = false)
    private ContactMech shippingContactMech;

    @ManyToOne
    @JoinColumn(name = "billing_contact_mech_id", nullable = false)
    private ContactMech billingContactMech;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ContactMech getShippingContactMech() {
		return shippingContactMech;
	}

	public void setShippingContactMech(ContactMech shippingContactMech) {
		this.shippingContactMech = shippingContactMech;
	}

	public ContactMech getBillingContactMech() {
		return billingContactMech;
	}

	public void setBillingContactMech(ContactMech billingContactMech) {
		this.billingContactMech = billingContactMech;
	}

	public OrderHeader(int orderId, Date orderDate, Customer customer, ContactMech shippingContactMech,
			ContactMech billingContactMech) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.customer = customer;
		this.shippingContactMech = shippingContactMech;
		this.billingContactMech = billingContactMech;
	}

    
}

package com.example.hotwaxLast.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderItemSeqId;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private OrderHeader order;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;
    private String status;
	public int getOrderItemSeqId() {
		return orderItemSeqId;
	}
	public void setOrderItemSeqId(int orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}
	public OrderHeader getOrder() {
		return order;
	}
	public void setOrder(OrderHeader order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public OrderItem(int orderItemSeqId, OrderHeader order, Product product, int quantity, String status) {
		super();
		this.orderItemSeqId = orderItemSeqId;
		this.order = order;
		this.product = product;
		this.quantity = quantity;
		this.status = status;
	}

    
}

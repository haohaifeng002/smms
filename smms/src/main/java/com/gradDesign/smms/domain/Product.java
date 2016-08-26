package com.gradDesign.smms.domain;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="product",catalog="smms")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * product表id
	 */
	@Id
	@Column(unique=true, nullable=false,length=32)
	@GenericGenerator(name="productId_",strategy="uuid")
	@GeneratedValue(generator="productId_")
	private String productId;
	
	/**
	 * 商品编码
	 */
	@Column(unique=true)
	private String productCode;
	/**
	 * 商品名称
	 */
	private String productName;
	/**
	 * 商品类型
	 */
	private String productType;
	/**
	 * 商品数量
	 */
	private float productNum;
	/**
	 * 进价
	 */
	private BigDecimal inPrice;
	/**
	 * 售价
	 */
	private BigDecimal outPrivate;
	/**
	 * 是否删除，1不删除，0删除
	 */
	private int isDelete;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public float getProductNum() {
		return productNum;
	}
	public void setProductNum(float productNum) {
		this.productNum = productNum;
	}
	public BigDecimal getInPrice() {
		return inPrice;
	}
	public void setInPrice(BigDecimal inPrice) {
		this.inPrice = inPrice;
	}
	public BigDecimal getOutPrivate() {
		return outPrivate;
	}
	public void setOutPrivate(BigDecimal outPrivate) {
		this.outPrivate = outPrivate;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
}

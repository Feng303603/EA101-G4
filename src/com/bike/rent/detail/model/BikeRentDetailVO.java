package com.bike.rent.detail.model;

import java.io.Serializable;
import java.sql.Date;

public class BikeRentDetailVO implements Serializable {
	
	public BikeRentDetailVO() {
		
	};
	private String sq_rent_detail_id;
	private String sq_rent_id;
	private String sq_bike_type_id;
	private String sq_bike_id;
	private Integer price;
	private Integer extra_cost;
	
	public Integer getExtra_cost() {
		return extra_cost;
	}
	public void setExtra_cost(Integer extra_cost) {
		this.extra_cost = extra_cost;
	}
	public Date getRsved_rent_date() {
		return rsved_rent_date;
	}
	public void setRsved_rent_date(Date rsved_rent_date) {
		this.rsved_rent_date = rsved_rent_date;
	}
	public Date getEx_return_date() {
		return ex_return_date;
	}
	public void setEx_return_date(Date ex_return_date) {
		this.ex_return_date = ex_return_date;
	}
	public Date getReal_return_date() {
		return real_return_date;
	}
	public void setReal_return_date(Date real_return_date) {
		this.real_return_date = real_return_date;
	}
	private Date rsved_rent_date;
	private Date ex_return_date;
	private Date real_return_date;
	
	public String getSq_rent_detail_id() {
		return sq_rent_detail_id;
	}
	public void setSq_rent_detail_id(String sq_rent_detail_id) {
		this.sq_rent_detail_id = sq_rent_detail_id;
	}
	public String getSq_rent_id() {
		return sq_rent_id;
	}
	public void setSq_rent_id(String sq_rent_id) {
		this.sq_rent_id = sq_rent_id;
	}
	public String getSq_bike_type_id() {
		return sq_bike_type_id;
	}
	public void setSq_bike_type_id(String sq_bike_type_id) {
		this.sq_bike_type_id = sq_bike_type_id;
	}
	public String getSq_bike_id() {
		return sq_bike_id;
	}
	public void setSq_bike_id(String sq_bike_id) {
		this.sq_bike_id = sq_bike_id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	
	
}

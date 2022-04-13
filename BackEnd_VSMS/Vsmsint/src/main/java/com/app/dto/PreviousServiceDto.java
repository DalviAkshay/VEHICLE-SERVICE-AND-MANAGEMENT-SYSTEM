package com.app.dto;

import java.time.LocalDate;

import com.app.pojos.ServiceType;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PreviousServiceDto {

	private String customerName;

	private String customerEmail;

	private LocalDate date;

	private String suggestedWork;

	private String vehicleNo;

	private String chasisNo;

	public PreviousServiceDto() {
		super();
	}

	@Override
	public String toString() {
		return "PreviousServiceDto [customerName=" + customerName + ", customerEmail=" + customerEmail + ", date="
				+ date + ", suggestedWork=" + suggestedWork + ", vehicleNo=" + vehicleNo + ", chasisNo=" + chasisNo
				+ ", serviceType=" + serviceType + ", billAmount=" + billAmount + ", isActive=" + isActive + "]";
	}

	public PreviousServiceDto(String customerName, String customerEmail, LocalDate date, String suggestedWork,
			String vehicleNo, String chasisNo, ServiceType serviceType, double billAmount, boolean isActive) {
		super();
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.date = date;
		this.suggestedWork = suggestedWork;
		this.vehicleNo = vehicleNo;
		this.chasisNo = chasisNo;
		this.serviceType = serviceType;
		this.billAmount = billAmount;
		this.isActive = isActive;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getSuggestedWork() {
		return suggestedWork;
	}

	public void setSuggestedWork(String suggestedWork) {
		this.suggestedWork = suggestedWork;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	public ServiceType getServiceType() {
		return serviceType;
	}

	public void setServiceType(ServiceType serviceType) {
		this.serviceType = serviceType;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	private ServiceType serviceType;

	private double billAmount;

	private boolean isActive;

	
}

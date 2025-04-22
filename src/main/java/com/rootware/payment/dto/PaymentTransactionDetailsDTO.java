package com.rootware.payment.dto;

import java.math.BigDecimal;
import java.sql.Date;

public class PaymentTransactionDetailsDTO {

    private Long epayTransId;
    private Long epayInstanceId;
    private String accountNumber;
    private Long serviceTypeId;
    private BigDecimal transAmount;
    private BigDecimal transValue;
    private String invoiceNo;
    private Date processDate;
    private String serviceNumber;
    private String idType;
    private String recipientId;
    private String recipientIdType;
    private String notificationNumber;
    private String processStatus;
    private String serviceCategory;
    private String reasonCode;
    private String nativeReasonCode;
    private String systemPostingStatus;
    private Date pmtReceivedDate;
    private String comments;
    private String backendSystem;
    private String postingStatusCode;
    private String internalBillCategory;
    private Boolean vatApplied;
    private BigDecimal postedAmount;
    private BigDecimal appliedAmount;
    private Long productId;

    
    public Long getEpayTransId() {
        return epayTransId;
    }

    public void setEpayTransId(Long epayTransId) {
        this.epayTransId = epayTransId;
    }

    public Long getEpayInstanceId() {
        return epayInstanceId;
    }

    public void setEpayInstanceId(Long epayInstanceId) {
        this.epayInstanceId = epayInstanceId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getServiceTypeId() {
        return serviceTypeId;
    }

    public void setServiceTypeId(Long serviceTypeId) {
        this.serviceTypeId = serviceTypeId;
    }

    public BigDecimal getTransAmount() {
        return transAmount;
    }

    public void setTransAmount(BigDecimal transAmount) {
        this.transAmount = transAmount;
    }

    public BigDecimal getTransValue() {
        return transValue;
    }

    public void setTransValue(BigDecimal transValue) {
        this.transValue = transValue;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getRecipientIdType() {
        return recipientIdType;
    }

    public void setRecipientIdType(String recipientIdType) {
        this.recipientIdType = recipientIdType;
    }

    public String getNotificationNumber() {
        return notificationNumber;
    }

    public void setNotificationNumber(String notificationNumber) {
        this.notificationNumber = notificationNumber;
    }

    public String getProcessStatus() {
        return processStatus;
    }

    public void setProcessStatus(String processStatus) {
        this.processStatus = processStatus;
    }

    public String getServiceCategory() {
        return serviceCategory;
    }

    public void setServiceCategory(String serviceCategory) {
        this.serviceCategory = serviceCategory;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getNativeReasonCode() {
        return nativeReasonCode;
    }

    public void setNativeReasonCode(String nativeReasonCode) {
        this.nativeReasonCode = nativeReasonCode;
    }

    public String getSystemPostingStatus() {
        return systemPostingStatus;
    }

    public void setSystemPostingStatus(String systemPostingStatus) {
        this.systemPostingStatus = systemPostingStatus;
    }

    public Date getPmtReceivedDate() {
        return pmtReceivedDate;
    }

    public void setPmtReceivedDate(Date pmtReceivedDate) {
        this.pmtReceivedDate = pmtReceivedDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBackendSystem() {
        return backendSystem;
    }

    public void setBackendSystem(String backendSystem) {
        this.backendSystem = backendSystem;
    }

    public String getPostingStatusCode() {
        return postingStatusCode;
    }

    public void setPostingStatusCode(String postingStatusCode) {
        this.postingStatusCode = postingStatusCode;
    }

    public String getInternalBillCategory() {
        return internalBillCategory;
    }

    public void setInternalBillCategory(String internalBillCategory) {
        this.internalBillCategory = internalBillCategory;
    }

    public Boolean getVatApplied() {
        return vatApplied;
    }

    public void setVatApplied(Boolean vatApplied) {
        this.vatApplied = vatApplied;
    }

    public BigDecimal getPostedAmount() {
        return postedAmount;
    }

    public void setPostedAmount(BigDecimal postedAmount) {
        this.postedAmount = postedAmount;
    }

    public BigDecimal getAppliedAmount() {
        return appliedAmount;
    }

    public void setAppliedAmount(BigDecimal appliedAmount) {
        this.appliedAmount = appliedAmount;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ResolutionBaseWithIdAndRoot
 */
public class ResolutionBaseWithIdAndRoot   {
  private String fraudCaseReference = null;

  private String fraudCaseResolutionRecordReference = null;

  private String fraudCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String customerAgreementReference = null;

  private String customerAgreement = null;

  private String merchantReference = null;

  private String merchantAgreementReference = null;

  private String merchantAgreement = null;

  private Object fraudCaseAnalysisRecord = null;

  private Object fraudCaseDeterminationRecord = null;

  private Object fraudCaseResolutionRecord = null;

  private String employeeBusinessUnitReference = null;

  private String correspondenceReference = null;

  private String documentReference = null;

  private String paymentOrderReference = null;

  private String fraudCaseResolutionSchedule = null;

  private String fraudCaseStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return fraudCaseReference
  **/

  public String getFraudCaseReference() {
    return fraudCaseReference;
  }

  public void setFraudCaseReference(String fraudCaseReference) {
    this.fraudCaseReference = fraudCaseReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return fraudCaseResolutionRecordReference
  **/

  public String getFraudCaseResolutionRecordReference() {
    return fraudCaseResolutionRecordReference;
  }

  public void setFraudCaseResolutionRecordReference(String fraudCaseResolutionRecordReference) {
    this.fraudCaseResolutionRecordReference = fraudCaseResolutionRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return fraudCaseType
  **/

  public String getFraudCaseType() {
    return fraudCaseType;
  }

  public void setFraudCaseType(String fraudCaseType) {
    this.fraudCaseType = fraudCaseType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerAgreementReference
  **/

  public String getCustomerAgreementReference() {
    return customerAgreementReference;
  }

  public void setCustomerAgreementReference(String customerAgreementReference) {
    this.customerAgreementReference = customerAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerAgreement
  **/

  public String getCustomerAgreement() {
    return customerAgreement;
  }

  public void setCustomerAgreement(String customerAgreement) {
    this.customerAgreement = customerAgreement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return merchantReference
  **/

  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return merchantAgreementReference
  **/

  public String getMerchantAgreementReference() {
    return merchantAgreementReference;
  }

  public void setMerchantAgreementReference(String merchantAgreementReference) {
    this.merchantAgreementReference = merchantAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantAgreement
  **/

  public String getMerchantAgreement() {
    return merchantAgreement;
  }

  public void setMerchantAgreement(String merchantAgreement) {
    this.merchantAgreement = merchantAgreement;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return fraudCaseAnalysisRecord
  **/

  public Object getFraudCaseAnalysisRecord() {
    return fraudCaseAnalysisRecord;
  }

  public void setFraudCaseAnalysisRecord(Object fraudCaseAnalysisRecord) {
    this.fraudCaseAnalysisRecord = fraudCaseAnalysisRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return fraudCaseDeterminationRecord
  **/

  public Object getFraudCaseDeterminationRecord() {
    return fraudCaseDeterminationRecord;
  }

  public void setFraudCaseDeterminationRecord(Object fraudCaseDeterminationRecord) {
    this.fraudCaseDeterminationRecord = fraudCaseDeterminationRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return fraudCaseResolutionRecord
  **/

  public Object getFraudCaseResolutionRecord() {
    return fraudCaseResolutionRecord;
  }

  public void setFraudCaseResolutionRecord(Object fraudCaseResolutionRecord) {
    this.fraudCaseResolutionRecord = fraudCaseResolutionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return paymentOrderReference
  **/

  public String getPaymentOrderReference() {
    return paymentOrderReference;
  }

  public void setPaymentOrderReference(String paymentOrderReference) {
    this.paymentOrderReference = paymentOrderReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return fraudCaseResolutionSchedule
  **/

  public String getFraudCaseResolutionSchedule() {
    return fraudCaseResolutionSchedule;
  }

  public void setFraudCaseResolutionSchedule(String fraudCaseResolutionSchedule) {
    this.fraudCaseResolutionSchedule = fraudCaseResolutionSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return fraudCaseStatus
  **/

  public String getFraudCaseStatus() {
    return fraudCaseStatus;
  }

  public void setFraudCaseStatus(String fraudCaseStatus) {
    this.fraudCaseStatus = fraudCaseStatus;
  }


}


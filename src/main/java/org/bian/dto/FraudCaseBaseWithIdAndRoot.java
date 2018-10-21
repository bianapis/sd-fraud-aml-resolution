package org.bian.dto;

/**
 * FraudCaseBaseWithIdAndRoot
 */
public class FraudCaseBaseWithIdAndRoot   {
  private String fraudCaseReference = null;

  private String fraudCaseType = null;

  private String productInstanceReference = null;

  private String customerReference = null;

  private String merchantReference = null;

  private String contactReference = null;

  private String transactionReference = null;

  private Object transactionRecord = null;

  private String caseLocation = null;

  private String dateTime = null;

  private String employeeBusinessUnitReference = null;

  private Object fraudCaseRecord = null;

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
   * @return contactReference
  **/

  public String getContactReference() {
    return contactReference;
  }

  public void setContactReference(String contactReference) {
    this.contactReference = contactReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return transactionReference
  **/

  public String getTransactionReference() {
    return transactionReference;
  }

  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return transactionRecord
  **/

  public Object getTransactionRecord() {
    return transactionRecord;
  }

  public void setTransactionRecord(Object transactionRecord) {
    this.transactionRecord = transactionRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return caseLocation
  **/

  public String getCaseLocation() {
    return caseLocation;
  }

  public void setCaseLocation(String caseLocation) {
    this.caseLocation = caseLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime 
   * @return dateTime
  **/

  public String getDateTime() {
    return dateTime;
  }

  public void setDateTime(String dateTime) {
    this.dateTime = dateTime;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return fraudCaseRecord
  **/

  public Object getFraudCaseRecord() {
    return fraudCaseRecord;
  }

  public void setFraudCaseRecord(Object fraudCaseRecord) {
    this.fraudCaseRecord = fraudCaseRecord;
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


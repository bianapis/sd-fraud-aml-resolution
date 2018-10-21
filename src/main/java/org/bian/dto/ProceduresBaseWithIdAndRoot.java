package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * ProceduresBaseWithIdAndRoot
 */
public class ProceduresBaseWithIdAndRoot   {
  private String fraudCaseReference = null;

  private String fraudCaseProcedureUpdateRecommendationReference = null;

  private String fraudCaseType = null;

  private String productServiceReference = null;

  private Object fraudCaseAnalysisRecord = null;

  private Object fraudCaseDeterminationRecord = null;

  private Object fraudCaseProcedureUpdateRecommendationRecord = null;


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
   * @return fraudCaseProcedureUpdateRecommendationReference
  **/

  public String getFraudCaseProcedureUpdateRecommendationReference() {
    return fraudCaseProcedureUpdateRecommendationReference;
  }

  public void setFraudCaseProcedureUpdateRecommendationReference(String fraudCaseProcedureUpdateRecommendationReference) {
    this.fraudCaseProcedureUpdateRecommendationReference = fraudCaseProcedureUpdateRecommendationReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return productServiceReference
  **/

  public String getProductServiceReference() {
    return productServiceReference;
  }

  public void setProductServiceReference(String productServiceReference) {
    this.productServiceReference = productServiceReference;
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
   * @return fraudCaseProcedureUpdateRecommendationRecord
  **/

  public Object getFraudCaseProcedureUpdateRecommendationRecord() {
    return fraudCaseProcedureUpdateRecommendationRecord;
  }

  public void setFraudCaseProcedureUpdateRecommendationRecord(Object fraudCaseProcedureUpdateRecommendationRecord) {
    this.fraudCaseProcedureUpdateRecommendationRecord = fraudCaseProcedureUpdateRecommendationRecord;
  }


}


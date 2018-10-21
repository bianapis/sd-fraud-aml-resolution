/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface FraudAmlResolutionApiService {

	FraudCaseBaseWithIdAndRoot executePost(FraudCaseBase request);
	
	FraudCaseBaseWithIdAndRoot executePut(String crReferenceId, FraudCaseBase request);
	
	RecordResponse record(String crReferenceId, FraudCaseBase request);
	
	FraudCaseBaseWithIdAndRoot requestPost(FraudCaseBase request);
	
	FraudCaseBaseWithIdAndRoot requestPut(String crReferenceId, FraudCaseBase request);
	
	AnalysisBaseWithIdAndRoot retrieveAnalysis(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	DeterminationBaseWithIdAndRoot retrieveDeterminations(String crReferenceId, String bqReferenceId);
	
	FraudCaseBaseWithIdAndRoot retrieve(String crReferenceId);
	
	List<String> retrieveRefIds();
	
	ProceduresBaseWithIdAndRoot retrieveProcedures(String crReferenceId, String bqReferenceId);
	
	ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	ResolutionBaseWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId);
	
	FraudCaseBaseWithIdAndRoot update(String crReferenceId, FraudCaseBase request);
	
}

/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class FraudAmlResolutionApiServiceImpl implements FraudAmlResolutionApiService {

	public FraudCaseBaseWithIdAndRoot executePost(FraudCaseBase request){
		return JsonReader.read("executePost-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
	public FraudCaseBaseWithIdAndRoot executePut(String crReferenceId, FraudCaseBase request){
		return JsonReader.read("executePut-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
	public RecordResponse record(String crReferenceId, FraudCaseBase request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public FraudCaseBaseWithIdAndRoot requestPost(FraudCaseBase request){
		return JsonReader.read("requestPost-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
	public FraudCaseBaseWithIdAndRoot requestPut(String crReferenceId, FraudCaseBase request){
		return JsonReader.read("requestPut-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
	public AnalysisBaseWithIdAndRoot retrieveAnalysis(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AnalysisBaseWithIdAndRoot.json",new TypeReference<AnalysisBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public DeterminationBaseWithIdAndRoot retrieveDeterminations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-DeterminationBaseWithIdAndRoot.json",new TypeReference<DeterminationBaseWithIdAndRoot>(){});
	}
	
	public FraudCaseBaseWithIdAndRoot retrieve(String crReferenceId){
		return JsonReader.read("retrieve-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public ProceduresBaseWithIdAndRoot retrieveProcedures(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ProceduresBaseWithIdAndRoot.json",new TypeReference<ProceduresBaseWithIdAndRoot>(){});
	}
	
	public ReportingBaseWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingBaseWithIdAndRoot.json",new TypeReference<ReportingBaseWithIdAndRoot>(){});
	}
	
	public ResolutionBaseWithIdAndRoot retrieveResolutions(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ResolutionBaseWithIdAndRoot.json",new TypeReference<ResolutionBaseWithIdAndRoot>(){});
	}
	
	public FraudCaseBaseWithIdAndRoot update(String crReferenceId, FraudCaseBase request){
		return JsonReader.read("update-FraudCaseBaseWithIdAndRoot.json",new TypeReference<FraudCaseBaseWithIdAndRoot>(){});
	}
	
}

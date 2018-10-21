/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class FraudAmlResolutionApiController {

	@Autowired
	FraudAmlResolutionApiService service;
	
	@Process.ExecutePost
	public BianResponse<FraudCaseBaseWithIdAndRoot> executePost(@RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.ExecutePut
	public BianResponse<FraudCaseBaseWithIdAndRoot> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<FraudCaseBaseWithIdAndRoot> requestPost(@RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<FraudCaseBaseWithIdAndRoot> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("analysis")
	@Process.Retrieve
	public BianResponse<AnalysisBaseWithIdAndRoot> retrieveAnalysis(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAnalysis(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("determinations")
	@Process.Retrieve
	public BianResponse<DeterminationBaseWithIdAndRoot> retrieveDeterminations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeterminations(crReferenceId, bqReferenceId));
	}
	
	@Process.Retrieve
	public BianResponse<FraudCaseBaseWithIdAndRoot> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("procedures")
	@Process.Retrieve
	public BianResponse<ProceduresBaseWithIdAndRoot> retrieveProcedures(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveProcedures(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<ReportingBaseWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("resolutions")
	@Process.Retrieve
	public BianResponse<ResolutionBaseWithIdAndRoot> retrieveResolutions(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveResolutions(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<FraudCaseBaseWithIdAndRoot> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<FraudCaseBase> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}

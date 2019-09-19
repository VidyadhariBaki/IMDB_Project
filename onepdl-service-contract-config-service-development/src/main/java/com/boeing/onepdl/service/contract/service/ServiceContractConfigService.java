package com.boeing.onepdl.service.contract.service;

import java.util.List;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;

public interface ServiceContractConfigService {

	public ServiceContractConfigModel saveServiceContract(ServiceContractConfigModel model) throws Exception;
	public List<ServiceContractConfigModel> getAllServiceContracts() throws Exception;
	public List<ServiceContractConfigModel> getServiceContractsByCriteria(ServiceContractConfigModelCriteria criteria) throws Exception;

}

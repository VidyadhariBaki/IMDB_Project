package com.boeing.onepdl.service.contract.repository;

import java.util.List;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;

@FunctionalInterface
public interface ServiceContractConfigRepositoryCriteria {

	public List<ServiceContractConfigModel> getServiceContractsByCriteria(ServiceContractConfigModelCriteria criteria)
			throws Exception;
}

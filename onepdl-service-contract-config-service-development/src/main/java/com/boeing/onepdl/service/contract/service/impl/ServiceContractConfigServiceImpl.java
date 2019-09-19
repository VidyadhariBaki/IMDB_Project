package com.boeing.onepdl.service.contract.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.boeing.onepdl.service.contract.constants.IConstants;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;
import com.boeing.onepdl.service.contract.repository.ServiceContractConfigRepository;
import com.boeing.onepdl.service.contract.service.ServiceContractConfigService;
import com.boeing.onepdl.service.contract.util.CommonUtil;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ServiceContractConfigServiceImpl implements ServiceContractConfigService {

	@Autowired
	private ServiceContractConfigRepository repository;

	/**
	 * Method used for Saving the Service Configuration Document!.
	 */

	@Override
	public ServiceContractConfigModel saveServiceContract(ServiceContractConfigModel model) throws Exception {
		System.out.println(model);
		System.out.println(model.getBuId());
		try {
			model = repository.save(prepareObject(model));
			System.out.println(model);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING, e.getMessage());
		}
		return model;
	}

	/**
	 * Method used for Getting All the Service Contracts.
	 */

	@Override
	public List<ServiceContractConfigModel> getAllServiceContracts() throws Exception {
		List<ServiceContractConfigModel> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING, e.getMessage());
		}
		return list;
	}

	/**
	 * Method used for Getting All the Service Contracts by Criteria!
	 */

	public List<ServiceContractConfigModel> getServiceContractsByCriteria(ServiceContractConfigModelCriteria criteria)
			throws Exception {
		System.out.println(criteria+"criteria");
		List<ServiceContractConfigModel> list = null;
		try {
			list = repository.getServiceContractsByCriteria(criteria);
			
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING, e.getMessage());
		}
		return list;
	}
	
	/**
	 * Method used for preparing the Object!.
	 * @param model
	 * @return
	 */
	private ServiceContractConfigModel prepareObject(ServiceContractConfigModel model)
	{
		if(!StringUtils.isEmpty(model.getScId()))
		{
			model.setUpdatedDate(CommonUtil.getCurrentDateInString());
		}else{
			model.setCreatedDate(CommonUtil.getCurrentDateInString());
		}
		return model;
	}

}

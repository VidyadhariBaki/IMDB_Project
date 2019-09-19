package com.boeing.onepdl.service.contract.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.boeing.onepdl.service.contract.constants.IConstants;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;
import com.boeing.onepdl.service.contract.repository.ServiceContractConfigRepositoryCriteria;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ServiceContractConfigRepositoryImpl implements ServiceContractConfigRepositoryCriteria {

	@Autowired
	private MongoTemplate repository;

	@Override
	public List<ServiceContractConfigModel> getServiceContractsByCriteria(ServiceContractConfigModelCriteria criteria) {
		
		List<ServiceContractConfigModel> events = null;
		try {
			events = repository.find(getWhereClause(criteria), ServiceContractConfigModel.class);
			System.out.println(events);
		} catch (Exception e) {
			log.error(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING , e);
			throw e;
		}
		return events;
	}

	/**
	 * Method used for Preparing the Where Clause
	 * 
	 * @param criteria
	 * @param builder
	 * @param model
	 * @return
	 */
	private Query getWhereClause(ServiceContractConfigModelCriteria criteria) {
		System.out.println(criteria);
		Query whereClause = new Query();
		if (!StringUtils.isEmpty(criteria.getBuId())) {
			
			whereClause.addCriteria(Criteria.where("buId").is(criteria.getBuId()));
		}
		if (!StringUtils.isEmpty(criteria.getCode())) {
			whereClause.addCriteria(Criteria.where("code").is(criteria.getCode()));
		}
		if (!StringUtils.isEmpty(criteria.getContractName())) {
			whereClause.addCriteria(Criteria.where("contractName").is(criteria.getContractName()));
		}
		if (!StringUtils.isEmpty(criteria.getInstanceId())) {
			whereClause.addCriteria(Criteria.where("instanceId").is(criteria.getInstanceId()));
		}
		if (!StringUtils.isEmpty(criteria.getLink())) {
			whereClause.addCriteria(Criteria.where("link").is(criteria.getLink()));
		}
		if (!StringUtils.isEmpty(criteria.getScId())) {
			whereClause.addCriteria(Criteria.where("scId").is(criteria.getScId()));
		}
		if (criteria.getStatus()!=null && criteria.getStatus() > 0) {
			System.out.println(criteria.getStatus()+"status");
			whereClause.addCriteria(Criteria.where("status").is(criteria.getStatus()));
		}
		return whereClause;
	}

	}

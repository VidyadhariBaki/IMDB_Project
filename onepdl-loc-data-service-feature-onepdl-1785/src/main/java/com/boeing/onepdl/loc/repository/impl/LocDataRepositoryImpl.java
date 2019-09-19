package com.boeing.onepdl.loc.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.boeing.onepdl.loc.repository.LocDataRepositoryCriteria;

import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class LocDataRepositoryImpl implements LocDataRepositoryCriteria {

	@Autowired
	private MongoTemplate template;

	@Override
	public List<LocDataModel> findByCriteria(LocDataCriteriaModel criteria) throws Exception {
		List<LocDataModel> list = null;
		try {
			list = template.find(getWhereClause(criteria), LocDataModel.class);
		} catch (Exception e) {
			log.error("Exception occurred while processing the request!" + e);
		}
		return list;
	}

	/**
	 * Method used for Preparing the Where Clause
	 * 
	 * @param criteria
	 * @param builder
	 * @param model
	 * @return
	 */
	private Query getWhereClause(LocDataCriteriaModel criteria) {
		Query whereClause = new Query();
		if (!StringUtils.isEmpty(criteria.getScId())) {
			whereClause.addCriteria(Criteria.where("scId").is(criteria.getScId()));
		}
		if (!StringUtils.isEmpty(criteria.getHostLocId())) {
			whereClause.addCriteria(Criteria.where("hostLocId").is(criteria.getHostLocId()));
		}	
		if (!StringUtils.isEmpty(criteria.getLocActive())) {
			whereClause.addCriteria(Criteria.where("locActive").is(criteria.getLocActive()));
		}			
		if (criteria.getStatus() != null && criteria.getStatus() > 0) {
			whereClause.addCriteria(Criteria.where("status").is(criteria.getStatus()));
		}
		if (!StringUtils.isEmpty(criteria.getId())) {
			whereClause.addCriteria(Criteria.where("Id").is(criteria.getId()));
		}
		if (!StringUtils.isEmpty(criteria.getBuId())) {
			whereClause.addCriteria(Criteria.where("buId").is(criteria.getBuId()));
		}
		return whereClause;
	}

}

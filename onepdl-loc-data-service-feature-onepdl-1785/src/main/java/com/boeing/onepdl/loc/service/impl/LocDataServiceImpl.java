package com.boeing.onepdl.loc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.boeing.onepdl.loc.constants.IConstants;
import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.boeing.onepdl.loc.repository.LocDataRepository;
import com.boeing.onepdl.loc.service.LocDataService;
import com.boeing.onepdl.loc.util.CommonUtil;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class LocDataServiceImpl implements LocDataService {

	
	@Autowired
	private LocDataRepository repository;

	/**
	 * save LocationData to DB.
	 * 
	 * @param model
	 * @return LocDataModel
	 */
	public LocDataModel saveLocationData(LocDataModel model) {
		//System.out.println(model);
		try {
			model = repository.save(prepareObject(model));
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
		}
		return model;
	}
	
	/**
	 * save all LocationData to DB.
	 * 
	 * @param model
	 * @return Iterable<LocDataModel>
	 */
	public Iterable<LocDataModel> saveLocationData(Iterable<LocDataModel> models) {
		try {
			models = repository.saveAll(prepareObjects(models));
			System.out.println(models);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
		}
		return models;
	}	

	/**
	 * retrieve all LocationData
	 * 
	 * @param model
	 * @return
	 */
	public List<LocDataModel> getAllLocationData() {
		List<LocDataModel> list = null;
		try {
			list = repository.findAll();
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
		}
		return list;
	}

	/**
	 * search LocationData by Criteria!.
	 * 
	 * @param criteria
	 * @return
	 */
	public List<LocDataModel> getLocationDataByCriteria(LocDataCriteriaModel criteria) {
		List<LocDataModel> list = null;
		try {
			list = repository.findByCriteria(criteria);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
		}
		return list;
	}

	
	/**
	 * Method used for preparing the Object!.
	 * @param model
	 * @return
	 */
	private LocDataModel prepareObject(LocDataModel model)
	{
		if(!StringUtils.isEmpty(model.getId()))
		{
			model.setUpdatedDate(CommonUtil.getCurrentDateInString());
		}else{
			model.setCreatedDate(CommonUtil.getCurrentDateInString());
		}
		model.setBuId("1");
		model.setScId("BCNOR");
		return model;
	}
	
	private Iterable<LocDataModel> prepareObjects(Iterable<LocDataModel> models)
	{
		System.out.println(models);
		for(LocDataModel model : models) {
			model = prepareObject(model);
		}
		return models;
	}
	
}

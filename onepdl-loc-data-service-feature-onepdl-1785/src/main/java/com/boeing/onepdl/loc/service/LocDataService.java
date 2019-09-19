package com.boeing.onepdl.loc.service;

import java.util.List;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;

public interface LocDataService {

	public Iterable<LocDataModel> saveLocationData(Iterable<LocDataModel> models);
	public LocDataModel saveLocationData(LocDataModel model);
	public List<LocDataModel> getAllLocationData();
	public List<LocDataModel> getLocationDataByCriteria(LocDataCriteriaModel criteria);
}

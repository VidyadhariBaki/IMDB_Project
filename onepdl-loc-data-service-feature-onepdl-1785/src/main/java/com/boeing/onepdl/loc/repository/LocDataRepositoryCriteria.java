package com.boeing.onepdl.loc.repository;

import java.util.List;

import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;

@FunctionalInterface
public interface LocDataRepositoryCriteria {

	public List<LocDataModel> findByCriteria(LocDataCriteriaModel criteria) throws Exception;
}

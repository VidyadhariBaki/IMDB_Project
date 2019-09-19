package com.boeing.onepdl.loc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boeing.onepdl.loc.model.LocDataModel;

@Repository
public interface LocDataRepository extends MongoRepository<LocDataModel, String>, LocDataRepositoryCriteria{

}

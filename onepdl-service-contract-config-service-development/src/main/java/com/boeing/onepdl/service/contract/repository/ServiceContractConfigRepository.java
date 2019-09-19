package com.boeing.onepdl.service.contract.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;

@Repository
public interface ServiceContractConfigRepository extends MongoRepository<ServiceContractConfigModel, String>,ServiceContractConfigRepositoryCriteria {

}

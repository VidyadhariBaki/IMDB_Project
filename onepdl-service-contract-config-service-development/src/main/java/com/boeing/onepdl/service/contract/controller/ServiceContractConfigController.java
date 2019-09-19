package com.boeing.onepdl.service.contract.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boeing.onepdl.service.contract.model.ServiceContractConfigModel;
import com.boeing.onepdl.service.contract.model.ServiceContractConfigModelCriteria;
import com.boeing.onepdl.service.contract.service.ServiceContractConfigService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequestMapping("/api-service/serviceContract/v1")
@Api(value = "This API is used for the Service Contracts CRUD! ")
@CrossOrigin
public class ServiceContractConfigController {

	@Autowired
	private ServiceContractConfigService service;

	/**
	 * This method is used for getting the Service Contracts by Criteria!
	 * 
	 * @param sc
	 * @return
	 */
	@PutMapping(value = "/criteria", produces = "application/json")
	@ApiOperation(httpMethod = "PUT", value = "This method is used for getting the Service Contracts by Specified Criteria! ", produces = "application/json", response = ServiceContractConfigModel.class)
	public ResponseEntity<?> getServiceContractsByCriteria(
			@RequestBody(required = true) ServiceContractConfigModelCriteria criteria) {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getServiceContractsByCriteria(criteria), HttpStatus.OK);

		} catch (Exception e) {
			log.info("Error occurred while processing!", e.getMessage());
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * This method is used for persisting the Service Contracts!
	 * 
	 * @param sc
	 * @return
	 */
	@PostMapping(value = "/save", produces = "application/json")
	@ApiOperation(httpMethod = "POST", value = "This method is used for persisting the Service Contracts !.", produces = "application/json", response = ServiceContractConfigModel.class)
	public ResponseEntity<?> saveReasonCode(@RequestBody(required = true) ServiceContractConfigModel model) {
	
		ResponseEntity<?> response = null;
		try {
		
			response = new ResponseEntity<>(service.saveServiceContract(model), HttpStatus.OK);
		

		} catch (Exception e) {
			log.info("Error occurred while processing!", e.getMessage());
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * This method is used for getting the Service Contracts!
	 * 
	 * @return
	 */
	@GetMapping(value = "/all", produces = "application/json")
	@ApiOperation(httpMethod = "GET", value = "This method is used for getting all the Service Contracts!.", produces = "application/json")
	public ResponseEntity<?> getAllServiceContracts() {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getAllServiceContracts(), HttpStatus.OK);

		} catch (Exception e) {
			log.info("Error occurred while processing!", e.getMessage());
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

}

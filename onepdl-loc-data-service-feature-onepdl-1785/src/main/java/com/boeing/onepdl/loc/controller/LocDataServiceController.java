package com.boeing.onepdl.loc.controller;

import java.util.HashMap;
import java.util.Map;

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

import com.boeing.onepdl.loc.constants.IConstants;
import com.boeing.onepdl.loc.model.LocDataCriteriaModel;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.boeing.onepdl.loc.service.LocDataService;
import com.boeing.onepdl.loc.util.CommonUtil;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/api-service/location/v1")
@Log4j2
@ApiModel(value = "Location Data CRUD Service")
@CrossOrigin
public class LocDataServiceController {

	@Autowired
	private LocDataService service;

	/**
	 * get location data by criteria
	 * 
	 * @param criteria
	 * @return
	 */
	@PostMapping(value = "/criteria", produces = "application/json")
	@ApiOperation(httpMethod = "POST", value = "This method is used for getting the Location data by Specified Criteria! ", produces = "application/json", response = LocDataModel.class)
	public ResponseEntity<?> getAlertsByCriteria(@RequestBody(required = true) LocDataCriteriaModel criteria) {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getLocationDataByCriteria(criteria), HttpStatus.OK);

		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * Save All Location data from JSON string
	 * 
	 * @param json formatted array of location data
	 * @return
	 */
	@ApiOperation(httpMethod = "POST", produces = "application/json", response = LocDataModel.class, value = "This API Operation is used for persisting the json formatted location data.")
	@PostMapping(value = "/save", produces = "application/json")
	public ResponseEntity<?> saveLocationData(@RequestBody(required = true) String json) {
		Map<String, Object> errorMsg = null;
		try {
			Iterable<LocDataModel> list = CommonUtil.convertJsonArray(json, LocDataModel.class);
			return new ResponseEntity<>(service.saveLocationData(list), HttpStatus.OK);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING, e.getMessage());
			errorMsg = new HashMap<String, Object>();
			errorMsg.put("errorMsg", IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING);
			return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * Save All Location data from Raw text
	 * 
	 * @param raw location file content
	 * @return
	 */
	@ApiOperation(httpMethod = "POST", produces = "application/json", response = LocDataModel.class, value = "This API Operation is used for persisting the Raw location file content.")
	@PostMapping(value = "/file/save", produces = "application/json")
	public ResponseEntity<?> saveLocationFileData(@RequestBody(required = true) String text) {
		Map<String, Object> errorMsg = null;
		try {
			Iterable<LocDataModel> list = CommonUtil.convertRawData(text);
			return new ResponseEntity<>(service.saveLocationData(list), HttpStatus.OK);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING, e.getMessage());
			errorMsg = new HashMap<String, Object>();
			errorMsg.put("errorMsg", IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING);
			return new ResponseEntity<>(errorMsg, HttpStatus.BAD_REQUEST);
		}
	}	
	/**
	 * save a Location Data
	 * 
	 * @param model
	 * @return
	 */
	@PutMapping(value = "/save", produces = "application/json")
	@ApiOperation(httpMethod = "PUT", value = "This method is used for saving a location data.", produces = "application/json", response = LocDataModel.class)
	public ResponseEntity<?> saveLocationData(@RequestBody(required = true) LocDataModel model) {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.saveLocationData(model), HttpStatus.OK);

		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

	/**
	 * get all Location data
	 * 
	 * @return
	 */
	@GetMapping(value = "/all", produces = "application/json")
	@ApiOperation(httpMethod = "GET", value = "This method is used for getting all the Location Data !.", produces = "application/json", response = LocDataModel.class)
	public ResponseEntity<?> getAllLocationData() {
		ResponseEntity<?> response = null;
		try {
			response = new ResponseEntity<>(service.getAllLocationData(), HttpStatus.OK);

		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
			response = new ResponseEntity<>("Error occurred while processing!", HttpStatus.BAD_REQUEST);
		}
		return response;
	}

}

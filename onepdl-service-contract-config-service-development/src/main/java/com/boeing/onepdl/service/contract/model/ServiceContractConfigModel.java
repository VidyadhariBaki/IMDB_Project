package com.boeing.onepdl.service.contract.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Document(value = "service_contract_config")
@JsonInclude(value = Include.NON_NULL)
@ToString
@NoArgsConstructor
public class ServiceContractConfigModel implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;

	@Id
	@Getter
	@Setter
	private String scId;
	@Getter
	@Setter
	private String code;
	@Getter
	@Setter
	private String contractName;
	@Getter
	@Setter
	private String buId;
	@Getter
	@Setter
	private String link;
	@Getter
	@Setter
	private String instanceId;
	@Getter
	@Setter
	private String createdBy;
	@Getter
	@Setter
	private String createdDate;
	@Getter
	@Setter
	private String updatedDate;
	@Getter
	@Setter
	private String updatedBy;
	@Getter
	@Setter
	private Integer status;
}

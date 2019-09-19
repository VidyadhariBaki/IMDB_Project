package com.boeing.onepdl.service.contract.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@NoArgsConstructor
@ToString
@JsonInclude(value = Include.NON_NULL)
public class ServiceContractConfigModelCriteria {

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
	private Integer status;

}

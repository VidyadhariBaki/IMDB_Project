//package com.boeing.onepdl.service.contract.model;
//
//import java.io.Serializable;
//import java.util.List;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.stereotype.Component;
//
//import com.fasterxml.jackson.annotation.JsonInclude;
//import com.fasterxml.jackson.annotation.JsonInclude.Include;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@Component
//@Document(value = "service_contract_by_user")
//@JsonInclude(value = Include.NON_NULL)
//@ToString
//@NoArgsConstructor
//public class UserServiceContractModel implements Serializable {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@Getter
//	@Setter
//	private String userId;
//	@Getter
//	@Setter
//	private String firstName;
//	@Getter
//	@Setter
//	private String lastName;
//	@Getter
//	@Setter
//	private String bemsId;
//	@Getter
//	@Setter
//	private List<ServiceContractConfigModel> serviceContracts;
//	@Getter
//	@Setter
//	private String buId;
//
//}

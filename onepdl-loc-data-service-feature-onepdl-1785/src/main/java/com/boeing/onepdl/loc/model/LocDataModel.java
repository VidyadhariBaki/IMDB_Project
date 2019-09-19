package com.boeing.onepdl.loc.model;

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
@Document(value = "loc_data")
@JsonInclude(value = Include.NON_NULL)
@NoArgsConstructor
@ToString
public class LocDataModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Getter
	@Setter
	private String Id;
	
	@Getter
	@Setter
	private String hostLocId;
	
	@Getter
	@Setter
	private String locName;
	
	@Getter
	@Setter
	private String locDescription;
	
	@Getter
	@Setter
	private String hostRegionId;
	
	@Getter
	@Setter
	private String hostParentLocId;
	
	@Getter
	@Setter
	private String hostLocTypeId;
	
	@Getter
	@Setter
	private String locActive;
	
	@Getter
	@Setter
	private String procAllowed;
	
	@Getter
	@Setter
	private String repaAllowed;
	
	@Getter
	@Setter
	private String ac_type;
	
	@Getter
	@Setter
	private String hostNetworkId;
	
	@Getter
	@Setter
	private String scId;
	
	@Getter
	@Setter
	private String buId;

	@Getter
	@Setter
	private Integer status; 

	@Getter
	@Setter
	private String createdBy;
	
	@Getter
	@Setter
	private String createdDate;
	
	@Getter
	@Setter
	private String updatedBy;
	
	@Getter
	@Setter
	private String updatedDate;
	
	@Getter
	@Setter
	private String hostProcessGroupId;
	
	@Getter
	@Setter
	private Integer transStatus;

}

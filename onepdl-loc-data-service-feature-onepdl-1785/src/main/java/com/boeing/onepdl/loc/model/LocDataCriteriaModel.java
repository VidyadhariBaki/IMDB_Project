package com.boeing.onepdl.loc.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@JsonInclude(value = Include.NON_NULL)
//@ToString
@NoArgsConstructor
public class LocDataCriteriaModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Getter
	@Setter
	private String Id; 
	@Getter
	@Setter
	private String scId;
	@Getter
	@Setter
	private String buId;
	@Getter
	@Setter
	private String locActive;
	@Getter
	@Setter	
	private String hostLocId;
	
	@Getter
	@Setter
	private Integer status; 

}

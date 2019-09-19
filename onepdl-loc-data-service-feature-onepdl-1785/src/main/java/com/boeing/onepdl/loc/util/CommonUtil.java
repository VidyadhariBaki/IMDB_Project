package com.boeing.onepdl.loc.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

import com.boeing.onepdl.loc.constants.IConstants;
import com.boeing.onepdl.loc.model.LocDataModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

@UtilityClass
@Log4j2
public class CommonUtil {

	private static final String DATE_FORMAT_STRING = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * This method is used for returning the Current Date in String!.
	 * 
	 * @return
	 */
	public static String getCurrentDateInString() {
		DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_STRING);
		Calendar cal = Calendar.getInstance();
		String date = dateFormat.format(cal.getTime());
		log.info(date);
		return date;
	}
	
	/**
	 * This method is used for converting a JSON Array into Iterable Map objects!.
	 * 
	 * @param message
	 * @return map
	 */
	public static <T> Iterable<T> convertJsonArray(String json, Class<? extends T> objectClass) throws Exception {
		Iterable<T> list = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
		    CollectionType javaType = mapper.getTypeFactory()
		    	      .constructCollectionType(List.class, objectClass);			
			list = mapper.readValue(json, javaType);
		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
			throw e;
		}
	return list;
	}
	
	
	/**
	 * parse raw location data !.
	 * 
	 * @param message
	 * @return list
	 */
	public static Iterable<LocDataModel> convertRawData(String content) throws Exception {

		List<LocDataModel> list = null;
		try {
			if (content != null && content.length() > 0) {
				List<String> lines = new LinkedList<String>(Arrays.asList(content.split("\n")));
				lines.remove(0); // Removing the header row
				list = new ArrayList<LocDataModel>();
				for (String line : lines) {
					String[] col = line.split(",");
					
					LocDataModel model = new LocDataModel();
					model.setHostLocId(col[1]);
					model.setLocName(col[2]);
					model.setLocDescription(col[3]);
					model.setHostRegionId(col[4]);
					model.setHostNetworkId(col[5]);
					model.setHostParentLocId(col[6]);
					model.setHostLocTypeId(col[7]);
					model.setLocActive(col[8]);
					model.setAc_type(col[9]);
					model.setProcAllowed(col[10]);
					model.setRepaAllowed(col[11]);
					model.setHostProcessGroupId(col[12]);
					model.setStatus(1);
					list.add(model);
				}				
			}

		} catch (Exception e) {
			log.info(IConstants.EXCEPTION_OCCURED_WHILE_PROCESSING + e.getMessage(), e);
			throw e;
		}
	return list;
	}	
}

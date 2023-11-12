package com.myhcl.library.payload.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErorrMessage {
	
	private String errMsg;
	private Date date;
	private Integer code;
	private String status;
	

}

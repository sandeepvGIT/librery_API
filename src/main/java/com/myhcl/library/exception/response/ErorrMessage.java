package com.myhcl.library.exception.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErorrMessage {
	
	private String errMsg;
	private LocalDate date;
	private Integer code;
	private String status;
	

}

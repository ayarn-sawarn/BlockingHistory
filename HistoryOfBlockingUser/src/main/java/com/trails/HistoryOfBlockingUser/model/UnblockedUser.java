package com.trails.HistoryOfBlockingUser.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnblockedUser {
	private String unbid;
	private String status;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date date;
	

}

package com.trails.HistoryOfBlockingUser.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection="userblocking")
public class Users {
	@Id
	private String id;
	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date userCreateddate;
	private List<BlockedUser> buser;
	private List<UnblockedUser> unuser;

}

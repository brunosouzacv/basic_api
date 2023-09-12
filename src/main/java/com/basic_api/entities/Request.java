package com.basic_api.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.basic_api.entities.enums.RequestState;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter 
@Setter
@ToString
@EqualsAndHashCode
public class Request {
	
	private Long id;
	private String subject;
	private String description;
	private Date criationDate;
	private RequestState requestState;
	private User user;
	private List <RequestStage> requestStage = new ArrayList<RequestStage>();

}

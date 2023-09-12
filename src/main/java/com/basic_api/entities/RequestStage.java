package com.basic_api.entities;

import java.util.Date;

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
public class RequestStage {
	
	private Long id;
	private Date realizationDate;
	private String description;
	private RequestState requestState;
	private Request request;
	private User user;

}

package com.basic_api.entities;

import java.util.ArrayList;
import java.util.List;
import com.basic_api.entities.enums.Role;
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
public class User {
	
	private Long id;
	private String name;
	private String email;
	private String password;
	private Role role;
	private List <Request> requests = new ArrayList<Request>();
	private List<RequestStage> requestStages = new ArrayList<RequestStage>();

}

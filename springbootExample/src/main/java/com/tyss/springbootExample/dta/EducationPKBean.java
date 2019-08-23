package com.tyss.springbootExample.dta;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.ToString.Exclude;




@Data
@Embeddable
public class EducationPKBean implements Serializable{
	
	
	@JsonIgnore
	@Exclude
	@JoinColumn(name="id")
    @ManyToOne
	private EmployeeInfoBean bean;
	@JsonProperty(value="EDUCATION_TYPE")
	@Column(name="EDUCATION_TYPE")
	private String educationType;
	

	
	
}

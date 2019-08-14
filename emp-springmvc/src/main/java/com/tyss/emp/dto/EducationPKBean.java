package com.tyss.emp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.tyss.emp.dto.EmployeeInfoBean;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Embeddable
public class EducationPKBean implements Serializable{
	
	@JoinColumn(name="id")
    @ManyToOne
	private EmployeeInfoBean bean;
	@Column(name="EDUCATION_TYPE")
	private String educationType;

}

package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Doctor_Id")
	private Integer doctorId;

	@Column(name = "Is_Active")
	private Boolean active;

	@Column(name = "Name")
	private String name;

	@Column(name = "Experience")
	private String experience;

	@Column(name = "Contact_Info")
	private String contactInfo;

}

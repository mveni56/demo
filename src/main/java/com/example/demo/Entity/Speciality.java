package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Speciality")
public class Speciality {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "speciality_Id")
	private Integer specialityId;

	@Column(name = "name")
	private String name;

	@Column(name = "specialization")
	private String specialization;

}

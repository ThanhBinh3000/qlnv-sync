package com.tcdt.qlnvsync.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "USER_ACTION")
@Data
@Builder
public class UserAction {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ACTION_SEQ")
	@SequenceGenerator(sequenceName = "USER_ACTION_SEQ", allocationSize = 1, name = "USER_ACTION_SEQ")
	private Long id;

	String action;
	String description;
	String status;
}
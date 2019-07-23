package com.ms.project.portafolio.app.usuarios.commons.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author German Vazquez Renteria
 * Date:  19 jul. 2019
 * Package Name: com.ms.project.portafolio.app.usuarios.commons.models.entity
 * Project Name: usuarios-commons
 */
@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, length = 30)
	private String nombre;

	private static final long serialVersionUID = 4467531611801172710L;

}

/**
 * 
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

/**
 * @author Romulo
 *
 */
@Entity
@Data
public class Pais {

	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String sigla;
	private String gentilico;
}

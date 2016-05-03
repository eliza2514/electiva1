package sv.edu.ucad.et1.tesario.data.entities;

/*
 * Nombre: Usuario.java
 * Finalidad: clase POJO de la tabla usuarios
 * autor: Elizabeth Gonzalez
 * ultima fecha de modificacion: 26-04-16
 */
import java.util.Date;

import javax.persistence.Column; 
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "infrep")

public class InfoRepos {
	
	//campos BD tabla
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codinfrep")
	private long codinfrep;
	
	@Column(name="fecregi")
	private Date fecregi;
	
	@Column(name="numregi")
	private Long numregi;
	
	//get&set
	public Long getCodinfrep(){
		return codinfrep;		
}
	public void setCodinfrep(long codinfrep){
		this.codinfrep = codinfrep;
	}
	public Date getFecregi(){
		return fecregi;		
}
	public void setFecregi(Date fecregi){
		this.fecregi = fecregi;
	}
	public Long getNumregi(){
		return numregi;
	}
	public void setNumregi(Long numregi){
		this.numregi = numregi; 
	}//definir metodos getters y setters
}//fin de la clase Usuario

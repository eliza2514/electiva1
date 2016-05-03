package sv.edu.ucad.et1.tesario.data.entities;

/*
 * Nombre: Usuario.java
 * Finalidad: clase POJO de la tabla usuarios
 * autor: Elizabeth Gonzalez
 * ultima fecha de modificacion: 26-04-16
 */


import javax.persistence.Access;
import javax.persistence.AccessType;
//import javax.persistence.CascadeType;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
//import javax.persistence.Transient;

@Entity
@Table(name="Bitacora")
@Access(value=AccessType.PROPERTY) //acceso a traves de getters

public class Bitacora {
	
	private Long codbit;
	private String fecini;
	private String fecfin;
	private Long codbibtes;
	private boolean estado;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codbit", updatable=false)		
	public Long getCodbit() {
		return codbit;
	}
	public void setCodbit(Long codbit) {
		this.codbit = codbit;
	}
	
	@Column(name="fecini", nullable=false)		
	public String getFecini() {
		return fecini;
	}
	public void setFecini(String fecini) {
		this.fecini = fecini;
	}
	
	@Column(name="fecfin", nullable=false)		
	public String getFecfin() {
		return fecfin;
	}
	public void setFecfin(String fecfin) {
		this.fecfin = fecfin;
	}
	
	@Column(name="codbibtes", updatable=false)		
	public Long getCodbibtes() {
		return codbibtes;
	}
	public void setCodbibtes(Long codbibtes) {
		this.codbibtes = codbibtes;
	}
	
	@Column(name="estado", nullable=false)		
	public boolean isEstado() {
	return estado;
	}
	public void setEstdep(boolean estado) {
		this.estado = estado;
	}
}//Fin
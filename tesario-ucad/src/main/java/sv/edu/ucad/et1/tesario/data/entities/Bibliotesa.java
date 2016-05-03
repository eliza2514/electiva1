package sv.edu.ucad.et1.tesario.data.entities;

import java.util.Date;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="bibtes")
@Access(value=AccessType.PROPERTY) //acceso a traves de getters
public class Bibliotesa {
	private Long codbibtes;
	private String tittes;
	private String auttes;
	private String nomase;
	private String nivacad;
	private String numpag;
	private String nomfac;
	private String destes;
	private Date fecregi;
	private Long codinfrep;
	private Long codbit;
	
	public Bitacora bit;	
	public InfoRepos infrep;
	
	
	//asociacion UnoaUno Unidireccional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="infrep")
	public InfoRepos getInforRepos() {
		return infrep;
	}
	public void setInfoRepos(InfoRepos infrep) {
		this.infrep = infrep;
	}
	
	//Asociacion UnoaUno Bidireccional
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Bitacora")
	public Bitacora getBitacora() {
		return bit;
	}
	public void setBitacora(Bitacora bitacora) {
		this.bit = bitacora;
	}

	//propiedad bandera, que se declara como @Transient
	private boolean estado;
	
	@Transient	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Codbibtes", updatable=false)	
	public Long getInfrep() {
		return codbibtes;
	}
	public void setodinfrep(Long codbibtes) {
		this.codbibtes = codbibtes;
	}
	
	@Column(name="tittes", nullable=false)		
	public String getTittes() {
		return tittes;
	}
	public void setTittes(String tittes) {
		this.tittes = tittes;
	}
	
	@Column(name="auttes", nullable=false)		
	public String getAuttes() {
		return auttes;
	}
	public void setAuttes(String auttes) {
		this.auttes = auttes;
	}
	
	@Column(name="nomase", nullable=false)		
	public String getNomase() {
		return nomase;
	}
	public void setNomase(String nomase) {
		this.nomase = nomase;
	}
	
	@Column(name="nivacad")		
	public String getNivacad() {
		return nivacad;
	}
	public void setNivacad(String nivacad) {
		this.nivacad = nivacad;
	}
	
	@Column(name="numpag", nullable=false)		
	public String getNumpag() {
		return numpag;
	}
	public void setNumpag(String numpag) {
		this.numpag = numpag;
	}
	
	@Column(name="nomfac", nullable= false)		
	public String getNomfac() {
		return nomfac;
	}
	public void setNomfac(String nomfac) {
		this.nomfac = nomfac;
	}
		
	@Column(name="destes", nullable=false)		
	public String getDestes() {
		return destes;
	}
	public void setDestes(String destes) {
		this.destes = destes;
	}
	
	@Column(name="fecregi")	
	public Date getFecregi() {
		return fecregi;
	}
	public void setFecregi(Date fecregi) {
		this.fecregi = fecregi;
	}
	
	@Column(name="codinfrep")	
	public Long getCodinfrep() {
		return codinfrep;
	}
	public void setCodinfrep(Long codinfrep) {
		this.codinfrep = codinfrep;
	}
	
	@Column(name="Codbit")	
	public Long getCodbit() {
		return codbit;
	}
	public void setCodbit(Long codbit) {
		this.codbit = codbit;
	}
}//fin de bibliografiaTesario

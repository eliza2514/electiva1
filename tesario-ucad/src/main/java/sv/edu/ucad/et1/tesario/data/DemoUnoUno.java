package sv.edu.ucad.et1.tesario.data;

import java.util.Date;
import org.hibernate.Session;

import sv.edu.ucad.et1.tesario.data.entities.Bibliotesa;
import sv.edu.ucad.et1.tesario.data.entities.Bitacora;

public class DemoUnoUno {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		
		//inicio de la transaccion
		try{
			org.hibernate.Transaction transaccion = sesion.beginTransaction();
		
			Bitacora bit = createNewBitacora();
			Bibliotesa bibtes = createNewBibliotesa(bit);

			sesion.save(bibtes);
			transaccion.commit();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			sesion.close();
			HibernateUtil.getSessionFactory().close();
		}
		
	}
	
	//clases empotradas que crean bibliografiaTesario y informaciondeRepositorio
	//crea un nuevo registro de Tesis
	
	private static Bibliotesa createNewBibliotesa(Bitacora bit) {
		Bibliotesa bibtes = new Bibliotesa();
		bibtes.setTittes("JAVA F");
		bibtes.setAuttes("Escarlethe&Elizabeth");
		bibtes.setNomase("HFTamayo");
		bibtes.setNivacad("Ingenieria en Sistemas");
		bibtes.setNumpag("250");
		bibtes.setNomfac("Economia");
		bibtes.setFecregi(new Date());
		//bibtes.setCodinfrep(bit);
		//modif por la OneToOne Uni bibtes.setCodbit((long) 1);
		bibtes.setCodbit((long) 1);		
		return bibtes;
	}
	
	//crea un nuevo registro informacion genral de repositorio
	private static Bitacora createNewBitacora() {
		Bitacora bit = new Bitacora();
		bit.setFecini("25-042-016");
		bit.setFecfin("25-04-2016");
		//infrep.setEstado(true);
		return bit;
	}

}//fin de la clase Principal
package sv.edu.ucad.et1.tesario.data;

import java.util.Date;
import org.hibernate.Session;
import sv.edu.ucad.et1.tesario.data.entities.Bibliotesa;

public class DemoPersistTesario {

	public static void main(String[] args)
	{
		Session sesion =HibernateUtil.getSessionFactory().openSession();
		sesion.getTransaction().begin(); 
		
		//Instancia de la clase entidad usuarios de repositorios tesario
		
		Bibliotesa bibtes = new Bibliotesa();
		
		// Uso de metodos
		bibtes.setTittes("Fundamentos de Java");
		bibtes.setAuttes("Elizabeth Gonzalez & Escarleth Campos");
		bibtes.setNomase("Ing.HTamayo");
		bibtes.setNivacad("Ingenieria en Sistemas");
		bibtes.setNumpag("1250");
		bibtes.setNomfac("Ciencias Economicas");
		bibtes.setDestes("Descripcionde Tesis");
		bibtes.setFecregi(new Date());
		//bibtes.setCodinfrep(infrep);
		//modif por la OneToOne Uni bibtes.setCodbit((long) 1);
		bibtes.setCodbit((long) 1);	
		
		//metodo de la persistencia para guardar la data
		sesion.save (bibtes);
		
		//METODO PARA CONFIRMAR LA TRANSACCION
		sesion.getTransaction().commit();
		
		//CIERRE DE LA SESION ACTIVA
		sesion.close();
		
			} //fin del metodo main
}// fin del metodo DemopersistUsureptes


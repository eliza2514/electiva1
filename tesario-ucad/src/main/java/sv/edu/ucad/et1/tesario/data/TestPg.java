package sv.edu.ucad.et1.tesario.data;

import org.hibernate.Session;
/*
 * Probar la conexion con postgres
 */
public class TestPg {
	public static void main(String[] args){
		Session sesion = HibernateUtil.getSessionFactory().openSession();
		sesion.beginTransaction();
		sesion.close();
	}
}



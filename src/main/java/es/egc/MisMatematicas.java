package es.egc;
import org.apache.log4j.*; 

/**
 * DIVISION
 *
 */
public class MisMatematicas 
{
	static Logger log=Logger.getLogger(MisMatematicas.class); 
	
	public static int divide(int a, int x){
		int result= a/x;
		log.info("Returning "+a+"/"+x+"="+result);
		return result;
	}
	
	public static int multiplica(int a, int b){
	int result= a*b;
	log.info("Returning "+a+"*"+b+"="+result);
	return result;
	}
	//Adios muy buenas
}
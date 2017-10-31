package org.anadiait.factorial;
/**
 * Clase que computa el factorial de un long 
 * @author Oscar Terres
 *
 */

public class Factorial { 

	public long compute(long value) {
		if (value < 0) {
		    throw new RuntimeException("The value is negative: " + value);
		}
	    if((value == 0) || (value ==1)) {
	    	return 1;
	    }else {
		return value * compute(value -1); 
	}

}
}

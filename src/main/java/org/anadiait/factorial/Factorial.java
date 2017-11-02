package org.anadiait.factorial;

/**
 * Clase que computa el factorial de un long
 * 
 * @author Oscar Terres
 *
 */

public class Factorial {

<<<<<<< HEAD
	public long compute(long value) {
		long result ;
		if (value < 0) {
			throw new RuntimeException("The value is negative: " + value);
		}
		if ((value == 0) || (value == 1)) {
			result = 1;
		} else {
			result = value * compute(value - 1);
		}
		return result ;
	}

	public String toString() {
		int a = 5;
		long b = a * 5;
		return "";
	}
=======
  public long compute(long value) {
    long result;
    if (value < 0) {
      throw new RuntimeException("The value is negative: " + value);
    }
    if ((value == 0) || (value == 1)) {
      result = 1;
    } else {
      result = value * compute(value - 1);
    }
    return result;
  }

  public String toString() {
    int a = 5;
    long b = a * 5;
    return "";
  }
>>>>>>> master

}

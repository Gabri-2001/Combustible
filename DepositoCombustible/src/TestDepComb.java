import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDepComb {
	private double depMax;
    private double depNivel;
	@Test
	public double getDepositoNivel(){
	       return depNivel;
	    }
	
	@Test
	public double getDepositoMax(){
	       return depMax;
	    }
	@Test
	public boolean estaVacio(){
	      return depNivel == 0;
	    }
	@Test 
	public boolean estaLleno(){
		  return depNivel == depMax;
	    }
	@Test
	public void fill(double amount){
	       depNivel = depNivel + amount;
	    }
	@Test
	public void consumir(double amount){
	       depNivel = depNivel - amount;
	    }
}

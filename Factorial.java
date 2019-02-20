 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        
        // Initialize result 
        BigInteger result = new BigInteger("1"); // Or BigInteger.ONE 
  
        // Multiply result with 2, 3, ...value 
        for (int i = 2; i <= value; i++) 
        result = result.multiply(BigInteger.valueOf(i)); 
  
        return result; 
    } 
 }  



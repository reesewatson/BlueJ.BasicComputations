 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        int result;

        if(value==1)
         return 1;

       result = factorialOf(value-1) * value;
       return result;
    }

}

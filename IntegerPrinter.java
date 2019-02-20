 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String result = "";
        while (value >= 1) {
            result = result + (value % 2);
            value = value / 2;
        }
        return result;
        
    }

    public String printIntegerAsOctal(int value){
        String result = "";
        while (value >= 1) {
            result = result + (value % 8);
            value = value / 2;
        }
        return result;
    
    }

    public String printIntegerAsHexadecimal(int value){
       String result = "";
       while (value >= 1) {
            result = result + (value % 16);
            value = value / 2;
       }
       return result;
    
    }

    public static void main(String[] args){

    }
}

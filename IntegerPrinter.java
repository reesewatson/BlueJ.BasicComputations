 


public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        String str = "";
      for(int a = 0; a < 8; a++)
      {
         if(value % 2 == 1)
         {
            value = "1" + str;
         }
         if(value % 2 == 0)
         {
            str = "0" + str;
         }
         value = value / 2;
      }
        return str;
    }

    public String printIntegerAsOctal(int value){
        int i = new Integer(20);
        String octal = Integer.toOctalString(i);
        System.out.println("Octal value: "+octal);
    
    }

    public String printIntegerAsHexadecimal(int value){
        int i = new Integer();
        String hex = Integer.toHexString(i);
        System.out.println("Hex value is " + hex);
        return null;
    }

    public static void main(String[] args){

    }
}

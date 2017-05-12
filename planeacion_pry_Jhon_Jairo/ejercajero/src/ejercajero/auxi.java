package ejercajero;
 
public class auxi {
 
    public static boolean isNum(String a){//metodo para validar si es un numero        
 
        try{
            int b = Integer.parseInt(a);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }        
    }
 
}
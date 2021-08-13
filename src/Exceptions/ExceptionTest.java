package Exceptions;

public class ExceptionTest {
    public static void main(String [] args){

        try {
            Product product = new Product("1");
            System.out.println(product.getCode());

        }
        catch (CodeException variable){
            System.out.println("El producto no fue creado por "+ variable.toString());
        }
        catch (Exception e){
            System.out.println("Error Exepcion");
        }



    }
}

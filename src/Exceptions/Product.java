package Exceptions;

public class Product {
    private  String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product(String code) throws CodeException{
        if(code.length()<3){
            throw new CodeException(code);
        }
        else  code= code;
    }
}

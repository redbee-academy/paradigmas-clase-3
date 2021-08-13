package Exceptions;

public class CodeException extends Exception {
    private String code;

    public CodeException(String code){
        this.code = code;
    }

    @Override
    public String toString() {
        return "CodeException{" +
                "code='" + code + '\'' +
                '}';
    }
}

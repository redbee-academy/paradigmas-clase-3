package Liskov;

import java.io.StringReader;
import java.security.Principal;

public abstract class Ave {
    private String pico;
    private String alas;
    private String tipoAve;

    public String volar(){ return "vuelo soy "+ tipoAve;}
}

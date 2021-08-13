package Liskov;

import java.util.logging.Logger;

public class Rectangle {
    private Long height;
    private Long with;

    public Long area(){return height* with;}

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    public Long getWith() {
        return with;
    }

    public void setWith(Long with) {
        this.with = with;
    }
}

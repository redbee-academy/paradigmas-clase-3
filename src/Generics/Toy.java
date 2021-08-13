package Generics;

public class Toy {
    private String owner;
    private String type;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "owner='" + owner + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

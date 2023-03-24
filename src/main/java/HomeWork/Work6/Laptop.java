package HomeWork.Work6;



public class Laptop {
    public  String name;
    public  Integer ram;
    public  String color;
    public  Integer graphicsCardVolume;

    public Laptop(String name, Integer ram, String color, Integer graphicsCardVolume) {
        this.name = name;
        this.ram = ram;
        this.color = color;
        this.graphicsCardVolume = graphicsCardVolume;
    }


    public String display() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", color='" + color + '\'' +
                ", graphicsCardVolume=" + graphicsCardVolume +
                '}';
    }

    public Integer getRam() {
        return ram;
    }

    public String getColor() {
        return color;
    }

    public Integer getGraphicsCardVolume() {
        return graphicsCardVolume;
    }

}

package JAVA.note;

public class NoteBook {
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public NoteBook(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public int getRam() {
        return ram;
    }
    public int getHdd() {
        return hdd;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand +" Объем ОЗУ:" + ram + " Объем HDD:" + hdd + " ОС:" + os + " Цвет:" + color;
    }   
    
}

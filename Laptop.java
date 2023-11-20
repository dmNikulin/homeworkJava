package homework_06;

import java.util.ArrayList;

public class Laptop {

    private String mark;
    private String os;
    private int ram; // random access memory
    private int hdd; // hard disk
    private String color;

    public Laptop(String mark, String os, int ram, int hdd, String color) {
        this.mark = mark;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.color = color;
    }

    public ArrayList<Object> getAll() {
        ArrayList<Object> all = new ArrayList<>();
        all.add(mark);
        all.add(os);
        all.add(ram);
        all.add(hdd);
        all.add(color);

        return all;
    }

    public String getMark() {
        return mark;
    }

    public String getOs() {
        return os;
    }

    public int getRam(){
        return ram;
    }

    public String getColor(){
        return color;
    }

    public int getHdd(){
        return hdd;
    }

    @Override
    public String toString() {
        return "Бренд: " + mark + "\n"
                + "ОС: " + os + "\n"
                + "ОЗУ: " + ram + "\n"
                + "Жесткий диск: " + hdd + "\n"
                + "Цвет: " + color + "\n";
    }
}

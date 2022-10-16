package Percobaan1_Inheritance_Js6;

public class ClassB extends ClassA{
    public int z;

    public void getNilai() {
        System.out.println ("nilai z : " + z);
    }

    public void getJumlah() {
        System.out.println ("jumlah : " + (x+y+z));
    }
}

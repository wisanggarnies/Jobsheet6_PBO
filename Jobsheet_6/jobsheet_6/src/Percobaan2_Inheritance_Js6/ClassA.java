package Percobaan2_Inheritance_Js6;

public class ClassA {
    public int x;
    public int y;

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }
    
    public void getNilai() {
        System.out.println ("nilai x : " + x);
        System.out.println ("nilai y : " + y);
    }
}

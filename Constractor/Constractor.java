package Constractor;

public class Constractor {
    private String username;
    private String password;
    public Constractor(){
        System.out.println("Ini adalah constructor");
    }
}
class DemoConstractor{
    public static void main(String[]args){
        Constractor cilsy = new Constractor();
    }
}
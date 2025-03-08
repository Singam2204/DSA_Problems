package OOPS;
interface Laptop{
    void run();
}
class Macbook implements Laptop{
    public void run(){
        System.out.println("Coding in Mac");
    }
}
class Lenovo implements Laptop{
    public void run(){
        System.out.println("Coding in Lenovo");
    }
}
class Developer{
    public void code(Laptop laptop){
        laptop.run();
    }
}

public class InterfaceExample{
    public static void main(String[] args) {
        Laptop mac = new Macbook();
        Laptop lenovo = new Lenovo();
        Developer developer=new Developer();
        developer.code(mac);
    }
}

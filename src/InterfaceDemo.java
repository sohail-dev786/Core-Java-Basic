interface  Writer{

    void write();
    abstract  void show();
}
class Pen implements Writer{

    @Override
    public void write() {
        System.out.println("I am Pen");
    }

    @Override
    public void show() {
        System.out.println("Pen Show Method Called");
    }
}

class Pencil implements  Writer{
    @Override
    public  void write(){
        System.out.println("I am Pencil");
    }

    @Override
    public void show() {
        System.out.println("Pencil Show Method Called");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("Interface Demo Working");
         Writer p=new Pen();
         Writer p1=new Pencil();
         p.write();
         p.show();
         p1.write();
         p1.show();
    }
}

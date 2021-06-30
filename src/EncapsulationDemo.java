class Student{

    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        System.out.println("Encapsulation Working");


        Student obj=new Student();
        obj.setId(101);
        obj.setName("Sohail");
        obj.setEmail("sohailss4444@gmail.com");

        Student obj1=new Student();
        obj1.setId(102);
        obj1.setName("Viral");
        obj1.setEmail("Viral@gmail.com");

        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getEmail());

        System.out.println();

        System.out.println(obj1.getId());
        System.out.println(obj1.getName());
        System.out.println(obj1.getEmail());


    }
}

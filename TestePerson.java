public class TestePerson {

    public static void main(String[] args) {
        Person p1 = new Person("Marina", 10, 10000);
       // p1.imprimedados();
       System.out.println(p1.getString());
       System.out.println(p1.idade);

       p1.setcpf("9999999999");
       System.out.println(p1.getcpf());
    }
}
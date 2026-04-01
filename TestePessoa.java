public class TestePessoa {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2;
       // p2 = new Pessoa(n,i,r);
       p2 = new Pessoa("joana",25,4300.00);

        System.out.println("Nome: " + p1.nome
                           + "\nIdade: " + p1.idade
                           + "\nRenda; "+ p1.renda);

        System.out.println("Nome: " + p2.nome
                           + "\nIdade: " + p2.idade
                           + "\nRenda; "+ p2.renda);
    }
}

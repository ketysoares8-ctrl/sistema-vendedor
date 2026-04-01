import javax.swing.JOptionPane;

public class Person {
    //atributos
    private String nome;
    public int idade;
    protected double renda;
    private String cpf;

    public Person(String nome, int idade, double renda){
        this.nome =nome;
        this.idade = idade;
        this.renda = renda;
    }
public String getString(){
    return nome;
}

public void setcpf(String cpf){
    this.cpf=cpf;

    public String getcpf(){
        return cpf
    }
}
    //metodos
    public void imprimedados(){
        JOptionPane.showMessageDialog(null,"<html><span style='color: blue' >Nome:                            </span>" +  nome 
                                            +"\nidade: " + idade
                                              +"\nrenda: " + renda);
    }
        }
    
    


import java.util.Scanner;

public class Funcionario {

    Scanner sc = new Scanner(System.in);

    public static final String INFORMAR_O_SEU_NOME = "Por favor, informar o seu Nome:";
    public static final String INFORMAR_SUA_IDADE = "Por favor, informar sua idade:";
    public static final String INFORMAR_O_SEU_BAIRRO = "Por favor, informar o seu bairro:";
    public static final String NOME = "Nome: %s!";
    public static final String IDADE = "Idade: %s Anos!";
    public static final String BAIRRO = "Bairro: %s!";

    private String nome;
    private int idade;
    private String bairro;

    public void inputdados () {

        Imprimir.i(INFORMAR_O_SEU_NOME);
        setNome(sc.nextLine());

        Imprimir.i(INFORMAR_SUA_IDADE);
        setIdade(Integer.parseInt(sc.nextLine()));

        Imprimir.i(INFORMAR_O_SEU_BAIRRO);
        setBairro(sc.nextLine());

    }

    public void outputdados () {

        Imprimir.i(String.format(NOME, getNome()));
        Imprimir.i(String.format(IDADE, getIdade()));
        Imprimir.i(String.format(BAIRRO, getBairro()));

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}

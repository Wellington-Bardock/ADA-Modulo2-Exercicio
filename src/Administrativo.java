import java.util.Scanner;

public class Administrativo extends Gerente{

    public static final String VALOR_HORA = "Valor Hora: R$ %.2f";
    public static final String SALARIO = "Salário: R$ %.2f";
    public static final String QUANTIDADE_DE_HORAS_EXTRAS = "Por favor, informar a quantidade de horas extras:";
    Scanner sc = new Scanner(System.in);

    public static final String QUANTIDADE_DE_HORAS_TRABALHADAS_NO_MES = "Por favor, informar a quantidade de horas trabalhadas no mês:";
    public static final String POR_FAVOR_INFORMAR_O_VALOR_HORA = "Por favor, informar o valor hora:";

    private double valorHora;
    private double salario;

    public void inputdados () {
        super.inputdados();
        Imprimir.i(QUANTIDADE_DE_HORAS_EXTRAS);
        setHorasExtras(Integer.parseInt(sc.nextLine()));

    }

    public void calculohrs() {

        Imprimir.i(POR_FAVOR_INFORMAR_O_VALOR_HORA);
        setValorHora(Double.parseDouble(sc.nextLine()));

        Imprimir.i(QUANTIDADE_DE_HORAS_TRABALHADAS_NO_MES);
        setHorasTrab(Integer.parseInt(sc.nextLine()));
        setSalario(valorHora*getHorasTrab());
    }

    public void outputdados() {
        super.outputdados();
        Imprimir.i(String.format(VALOR_HORA, getValorHora()));
        Imprimir.i(String.format(SALARIO, getSalario()));

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

}

import java.util.Scanner;

public class Gerente extends Funcionario{

    Scanner sc = new Scanner(System.in);

    public static final String QUANTIDADE_HORAS_TRABALHADAS_NA_SEMANA = "Por favor, informar a quantidade horas trabalhadas na semana:";
    public static final String HORAS_TRABALHADAS = "Horas trabalhadas: %s horas!";
    public static final String HORAS_EXTRAS = "Horas extras: %s horas!";

    private int horasTrab;
    private int horasExtras;

    public void calculohrs () {

        int horastrabalho = 44;

        Imprimir.i(QUANTIDADE_HORAS_TRABALHADAS_NA_SEMANA);
        setHorasTrab(Integer.parseInt(sc.nextLine()));
        setHorasExtras(horasTrab- horastrabalho);
    }

    public void outputdados () {
        super.outputdados();
        Imprimir.i(String.format(HORAS_TRABALHADAS, getHorasTrab()));
        Imprimir.i(String.format(HORAS_EXTRAS, getHorasExtras()));

    }

    public int getHorasTrab() {
        return horasTrab;
    }

    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

}

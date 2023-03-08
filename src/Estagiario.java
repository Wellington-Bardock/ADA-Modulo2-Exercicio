import java.util.Scanner;

public class Estagiario extends Funcionario{

    public static final String QUANTIDADE_DE_HORAS_ESTAGIADAS_NA_SEMANA = "Por favor, informar a quantidade de horas estágiadas na semana:";
    public static final String QUANTIDADE_DE_MESES_ESTAGIADOS = "Por favor, informar a quantidade de meses estágiados:";
    public static final String MESES_DE_ESTAGIO = "Meses de estágio: %s meses!";
    public static final String HORAS_DE_ESTAGIO_POR_SEMANA = "Horas de estágio por semana: %s horas!";
    public static final String HORAS_TRABALHADAS_S_HORAS = "Horas trabalhadas: %s horas!";
    public static final String HORAS_TRABALHADAS = HORAS_TRABALHADAS_S_HORAS;
    Scanner sc = new Scanner(System.in);

    private int horasEst;
    private int mesesTrab;
    private int horasT;

    public void calculohrs () {

        int diasuteis = 22;

        Imprimir.i(QUANTIDADE_DE_HORAS_ESTAGIADAS_NA_SEMANA);
        setHorasEst(Integer.parseInt(sc.nextLine()));

        Imprimir.i(QUANTIDADE_DE_MESES_ESTAGIADOS);
        setMesesTrab(Integer.parseInt(sc.nextLine()));

        setHorasT(((getHorasEst()/5)*diasuteis)*getMesesTrab());

    }

    public void outputdados () {
        super.outputdados();
        Imprimir.i(String.format(MESES_DE_ESTAGIO,getMesesTrab()));
        Imprimir.i(String.format(HORAS_DE_ESTAGIO_POR_SEMANA,getHorasEst()));
        Imprimir.i(String.format(HORAS_TRABALHADAS,getHorasT()));

    }

    public int getHorasEst() {
        return horasEst;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }

    public int getMesesTrab() {
        return mesesTrab;
    }

    public void setMesesTrab(int mesesTrab) {
        this.mesesTrab = mesesTrab;
    }

    public int getHorasT() {
        return horasT;
    }

    public void setHorasT(int horasT) {
        this.horasT = horasT;
    }

}

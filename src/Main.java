import java.util.Scanner;

public class Main {

    public static final String LOOP_LANCAMENTO = "\nGostaria de realizar outro lançamento? S/N";
    public static final String OPCAO_INVALIDA = "Opção Inválida\n";
    public static final String MENU_TIPO_FUNCIONARIO = """
            Por favor, informar o tipo de funcionário:
            1 - ESTAGIÁRIO\s
            2 - GERENTE\s
            3 - ADMINISTRATIVO
            """;

    public static void main(String[] args) {

        boolean loop = false;

        Scanner sc = new Scanner(System.in);
        Administrativo a = new Administrativo();
        Gerente g = new Gerente();
        Estagiario e = new Estagiario();

        do {

            try {

                Imprimir.i(MENU_TIPO_FUNCIONARIO);

                int menu = Integer.parseInt(sc.nextLine());


                switch (menu) {
                    case 1 -> {
                        e.inputdados();
                        e.calculohrs();
                        e.outputdados();
                    }
                    case 2 -> {
                        g.inputdados();
                        g.calculohrs();
                        g.outputdados();
                    }
                    case 3 -> {
                        a.inputdados();
                        a.calculohrs();
                        a.outputdados();
                    }
                    default -> Imprimir.i(OPCAO_INVALIDA);

                }

                Imprimir.i(LOOP_LANCAMENTO);
                String loopAswer = sc.nextLine();
                if (loopAswer.equalsIgnoreCase("S")) {
                    loop = true;
                }

            } catch (NumberFormatException ex) {
                Imprimir.i(OPCAO_INVALIDA);
                main(args);

            }

        } while (loop);

    }
}
public class ControleFluxo {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Informe exatamente dois números inteiros como argumentos.");
            System.exit(1);
        }

        int primeiroParametro = 0;
        int segundoParametro = 0;

        try {
            primeiroParametro = Integer.parseInt(args[0]);
            segundoParametro = Integer.parseInt(args[1]);

            if (primeiroParametro <= 0 || segundoParametro <= 0) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            for (int i = primeiroParametro; i <= segundoParametro; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        } catch (NumberFormatException e) {
            System.err.println("Os argumentos devem ser números inteiros válidos.");
            System.exit(1);
        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

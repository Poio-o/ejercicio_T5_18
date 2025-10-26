public class App {
    public static void main(String[] args) throws Exception {
        try {
            boolean distintos;
            int num1;
            int num2;
            do {
                num1 = Integer.parseInt(System.console().readLine("Introduzca un número entero: "));
                num2 = Integer
                        .parseInt(System.console().readLine("Introduzca otro número entero distinto al anterior: "));
                if (num1 == num2) {
                    distintos = false;
                    System.out.println("Los números no pueden ser iguales");
                } else {
                    distintos = true;
                }
            } while (distintos == false);

            if (num2 < num1) {
                int aux = num2;
                num2 = num1;
                num1 = aux;
            }
            for (int i = num1; i <= num2; i += 7) {
                System.out.print(i + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("Número inválido");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error inesperado");
        }
    }
}

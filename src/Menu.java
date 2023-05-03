import java.util.Scanner;

public class Menu {
    public void menu() {
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);

        int menu;
        do {
            int op;
            System.out.println("--MENU DE OPERACIONES--");
            System.out.println(" [1] Suma");
            System.out.println(" [2] Resta");
            System.out.println(" [3] Multiplicacion");
            System.out.println(" [4] Divicion");
            System.out.println(" [5] Salir");
            menu = scanner.nextInt();
            switch (menu) {
                case 1 -> {
                    do {
                    System.out.println("INGRESA LOS TIPOS DE VARIABLES A SUMAR");
                    System.out.println(" [1] Int");
                    System.out.println(" [2] double");
                    System.out.println(" [3] float");
                    op = scanner.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                                System.out.println("Numero 1: ");
                                int num1 = scanner.nextInt();
                                System.out.println("Numero 2: ");
                                int num2 = scanner.nextInt();
                                int suma = operaciones.suma(num1, num2);
                                System.out.println(" Resultado = " + suma);
                            }
                            case 2 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                                System.out.println("Numero 1: ");
                                Double num12 = scanner.nextDouble();
                                System.out.println("Numero 2: ");
                                Double num22 = scanner.nextDouble();
                                Double suma2 = operaciones.suma(num12, num22);
                                System.out.println(" Resultado = " + suma2);
                            }
                            case 3 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES SUMAR");
                                System.out.println("Numero 1: ");
                                Float num13 = scanner.nextFloat();
                                System.out.println("Numero 2: ");
                                Float num23 = scanner.nextFloat();
                                Float suma3 = operaciones.suma(num13, num23);
                                System.out.println(" Resultado = " + suma3);
                            }
                            default -> {
                            }
                        }
                }while (op != 4);
                }
                case 2 -> {
                    do {
                        System.out.println("INGRESA LOS TIPOS DE VARIABLES A RESTAR");
                        System.out.println(" [1] Int");
                        System.out.println(" [2] double");
                        System.out.println(" [3] float");
                        op = scanner.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES RESTA");
                                System.out.println("Numero 1: ");
                                int res1 = scanner.nextInt();
                                System.out.println("Numero 2: ");
                                int res2 = scanner.nextInt();
                                int resta = operaciones.resta(res1, res2);
                                System.out.println(" Resultado = " + resta);
                            }
                            case 2 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES RESTA");
                                System.out.println("Numero 1: ");
                                Double res12 = scanner.nextDouble();
                                System.out.println("Numero 2: ");
                                Double res22 = scanner.nextDouble();
                                Double resta2 = operaciones.resta(res12, res22);
                                System.out.println(" Resultado = " + resta2);
                            }
                            case 3 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES RESTA");
                                System.out.println("Numero 1: ");
                                Float res13 = scanner.nextFloat();
                                System.out.println("Numero 2: ");
                                Float res23 = scanner.nextFloat();
                                Float resta3 = operaciones.resta(res13, res23);
                                System.out.println(" Resultado = " + resta3);
                            }
                            default -> {
                            }
                        }
                    }while (op != 4);
                }
                case 3 -> {
                    do {
                        System.out.println("INGRESA LOS TIPOS DE VARIABLES A MULTIPLICAR");
                        System.out.println(" [1] Int");
                        System.out.println(" [2] double");
                        System.out.println(" [3] float");
                        op = scanner.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES MULTIPLICAR");
                                System.out.println("Numero 1: ");
                                int mul1 = scanner.nextInt();
                                System.out.println("Numero 2: ");
                                int mul2 = scanner.nextInt();
                                int multi1 = operaciones.multi(mul1, mul2);
                                System.out.println(" Resultado = " + multi1);
                            }
                            case 2 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES MULTIPLICAR");
                                System.out.println("Numero 1: ");
                                Double mul12 = scanner.nextDouble();
                                System.out.println("Numero 2: ");
                                Double mul22 = scanner.nextDouble();
                                Double multi2 = operaciones.multi(mul12, mul22);
                                System.out.println(" Resultado = " + multi2);
                            }
                            case 3 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES MULTIPLICAR");
                                System.out.println("Numero 1: ");
                                Float mul13 = scanner.nextFloat();
                                System.out.println("Numero 2: ");
                                Float mul23 = scanner.nextFloat();
                                Float multi3 = operaciones.multi(mul13, mul23);
                                System.out.println(" Resultado = " + multi3);
                            }
                            default -> {
                            }
                        }
                    }while (op != 4);
                }
                case 4 -> {
                    do {
                        System.out.println("INGRESA LOS TIPOS DE VARIABLES A RESTAR");
                        System.out.println(" [1] Int");
                        System.out.println(" [2] double");
                        System.out.println(" [3] float");
                        op = scanner.nextInt();
                        switch (op) {
                            case 1 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES DIVIDIR");
                                System.out.println("Numero 1: ");
                                int div1 = scanner.nextInt();
                                System.out.println("Numero 2: ");
                                int div2 = scanner.nextInt();
                                int divi = operaciones.operacion(div1, div2);
                                System.out.println(" Resultado = " + divi);
                            }
                            case 2 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES DIVIDIR");
                                System.out.println("Numero 1: ");
                                Double div12 = scanner.nextDouble();
                                System.out.println("Numero 2: ");
                                Double div22 = scanner.nextDouble();
                                Double divi2 = operaciones.operacion(div12, div22);
                                System.out.println(" Resultado = " + divi2);
                            }
                            case 3 -> {
                                System.out.println("INGRESA LOS NUMEROS QUE DESEES DIVIDIR");
                                System.out.println("Numero 1: ");
                                Float div13 = scanner.nextFloat();
                                System.out.println("Numero 2: ");
                                Float div23 = scanner.nextFloat();
                                Float divi3 = operaciones.operacion(div13, div23);
                                System.out.println(" Resultado = " + divi3);
                            }
                            default -> {
                            }
                        }
                    }while (op != 4);
                }
                default -> {
                }
            }
        }while (menu != 5);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Maquina cafeteria = new Maquina();
        Scanner input = new Scanner( System.in );
        showMenu( cafeteria, input);
    }
    public static void showMenu( Maquina cafeteria, Scanner input ){
        System.out.println("Bienvenido a la cafeteria :) \n");
        System.out.println("Que quieres hacer hoy?");
        System.out.println("01. Servir Cafe \n02. Revisar Deposito \n03. Salir ");
        switch ( input.nextInt() ){
            case 1: {
                System.out.println("Elige Tipo de Cafe");
                System.out.println("01. Americano \n02. Expresso \n03. Capuchino");
                switch ( input.nextInt() ){
                    case 1: {
                        System.out.println( cafeteria.makeAmerican() );
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 2: {
                        System.out.println( cafeteria.makeExpresso() );
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 3: {
                        System.out.println( cafeteria.makeCapuchino() );
                        showMenu( cafeteria, input );
                        break;
                    }
                    default: System.out.println("Opcion Invalida");
                        showMenu( cafeteria, input );
                }
                break;
            }
            case 2: {
                System.out.println("Ver reservas de:");
                System.out.println("01. Cafe \n02. Agua \n03. Crema \n04. Vasos \n05.Todo");
                switch ( input.nextInt() ){
                    case 1: {
                        System.out.println("Hay de cafe: " + cafeteria.getCoffe() + "gr");
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 2: {
                        System.out.println("Hay de agua: " + cafeteria.getWater() + "ml");
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 3: {
                        System.out.println("Hay de crema: " + cafeteria.getCream() + "gr");
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 4: {
                        System.out.println("Hay de vasos: " + cafeteria.getCoup() );
                        showMenu( cafeteria, input );
                        break;
                    }
                    case 5: {
                        System.out.println("Cafe: " + cafeteria.getCoffe() );
                        System.out.println("Agua: " + cafeteria.getWater() );
                        System.out.println("Crema: " + cafeteria.getCream() );
                        System.out.println("Vasos: " + cafeteria.getCoup() );
                        showMenu( cafeteria, input );
                        break;
                    }
                    default: System.out.println("Opcion Invalida");
                        showMenu( cafeteria, input );
                }
                break;
            }
            case 3: {
                System.out.println("Adios :)");
                break;
            }
            default: System.out.println("Opcion Invalida");
                showMenu( cafeteria, input );
        }
    }
}
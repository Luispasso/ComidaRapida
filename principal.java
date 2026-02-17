import java.util.Scanner;
public class principal {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        datos [][] m = new datos[2][2];
        metodos met = new metodos();

        System.out.println("BIENVENIDOS");
        while(true)
        {
            System.out.println();
            System.out.println("1. Ingresar pedido");
            System.out.println("2. Buscar");
            System.out.println("3. Modificar");
            System.out.println("4. Realizar venta");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    m = met.ingreseP(m);
                    break;
                case 2:
                    System.out.println("Disponible pronto");
                    break;
                case 3:
                    System.out.println("Disponible pronto");
                    break;
                case 4:
                    System.out.println("Disponible pronto");
                    break;
                default:
                    break;
            }
             if(opcion == 5)
                break;
        }
    }

}

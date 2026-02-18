import java.util.Scanner;

public class metodos {

    

    public datos [][] ingreseP (datos[][] m ){
  
             int cod = 100;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) 
                {
                    cod++;
                    ingreseI(m, i, j, cod);

                }
            }
                                
        
        return m;

    }
    
    public datos[][] Buscar(datos[][] m, int opc)
    {  
        Scanner sc= new Scanner(System.in);
       System.out.println("Ingrese el id: ");
       int clave = sc.nextInt();   
       int sw = 0;
       for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) 
                {
                    if (m[i][j].getId() == clave) {

                        if(opc != 4)
                        {
                        System.out.println("Su comida es: " + m[i][j].getTipoComida());
                        System.out.println("El tamaño es:" + m[i][j].getTamaño());
                        System.out.println(m[i][j].getCantidad());
                        System.out.println(m[i][j].getEstado());
                        System.out.println(m[i][j].getPrecio());
                        System.out.println(m[i][j].getId());
                      
                      
                        sw = 1;
                        }
                        if(opc == 3)
                         {  
                             int cod = m[i][j].getId();
                            ingreseI(m, i, j, cod);
                         }
                        else if(opc == 4)
                        {
                            int cod = m[i][j].getId();
                            Finalizar(m, i, j, cod);
                        }
                  }
                    
                }
            }
        
        

        if(sw == 0)
            System.out.println("No encontrado");
        return m;
    }
   
   
    public datos[][] ingreseI(datos[][] m, int i, int j, int cod)
    {
        Scanner sc = new Scanner(System.in);
        datos o = new datos();

        
        System.out.println("Seleccione el tipo de comida: ");
        System.out.println("1. Perro");
        System.out.println("2. Hamburgguesa");
        System.out.println("3. Salchipapa");
        System.out.println("4. Perra");
        System.out.println("+---------------------+");

        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: o.setTipoComida("Perro");
               break;
            case 2: o.setTipoComida("Hamburguesa");
                break;
            case 3: o.setTipoComida("Salchipapa");
                break;
            case 4: o.setTipoComida("Perra");
                break;
            
            default:
                break;
        }

        System.out.println("Selecione el tamaño: ");
        System.out.println("1. Grande");
        System.out.println("2. Mediano");
        System.out.println("3. pequeño");
        System.out.println("-----------------------");
        
        opcion = sc.nextInt();

        switch (opcion) {
            case 1: o.setTamaño("Grande");
                
                break;
            case 2: o.setTamaño("Mediano");
                break;
            case 3: o.setTamaño("Pequeño");
                break;
            default:
                break;
        }

        if(o.getTipoComida() == "Perro" && o.getTamaño() == "Grande")
            o.setPrecio(20000);
        else if(o.getTipoComida() == "Perro" && o.getTamaño() == "Mediano")
            o.setPrecio(15000);
        else if(o.getTipoComida() == "Perro" && o.getTamaño() == "Pequeño")
            o.setPrecio(10000);
            
        if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Grande")
            o.setPrecio(25000);
        else if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Mediano")
            o.setPrecio(19000);
        else if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Pequeño")
            o.setPrecio(14000);

        if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Grande")
            o.setPrecio(22000);
        else if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Mediano")
            o.setPrecio(16000);
        else if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Pequeño")
            o.setPrecio(11000);

        if(o.getTipoComida() == "Perra" && o.getTamaño() == "Grande")
            o.setPrecio(26000);
        else if(o.getTipoComida() == "Perra" && o.getTamaño() == "Mediano")
            o.setPrecio(20000);
        else if(o.getTipoComida() == "Perra" && o.getTamaño() == "Pequeño")
            o.setPrecio(15000);

        System.out.println("Ingrese la cantidad de:" + o.getTipoComida() + " tamaño:" + o.getTamaño());
        o.setCantidad(sc.nextInt());

        o.setEstado("En proceso");
            o.setId(cod);
            m[i][j] = o;
           
            System.out.println("El id del pedido es: " + m[i][j].getId());

            return m;
}    
    public datos[][] Finalizar(datos[][] m, int i, int j, int cod){
        System.out.println(m[i][j].getTipoComida() + " " + m[i][j].getTamaño() + " " + m[i][j].getCantidad() + " " + (m[i][j].getPrecio() * m[i][j].getCantidad()) + " " + m[i][j].getId());
        m[i][j].setEstado("Finalizado");
        return m;
    }

    }



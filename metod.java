import java.util.Scanner;

public class metod {

    

    public datos [][] ingreseP (datos[][] m ){
  
             int cod = 100;
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) 
                {
                    cod++;
                    ingreseI(m, i, j);
                    m[i][j].setId(cod);
                    System.out.println("El id del pedido es: " + m[i][j].getId());

                }
            }
                                
        
        return m;

    }
    
    public datos[][] Buscar(datos[][] m, int opc)
    {
      
       for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) 
                {
                    System.out.println(m[i][j].getId() + " " + m[i][j].getPrecio());
                    System.out.println();
                    
                }
            }
        if(opc == 2)
        {
             System.out.println("Area de busqueda no disponible");
        }
         else if(opc == 3)
        {  
            System.out.println("Area de modificacion no disponible");
        }
         else
        {
             System.out.println("Area de realizar venta no disponible");
        }


        return m;
    }
   
   
    public datos[][] ingreseI(datos[][] m, int i, int j)
    {
        Scanner sc = new Scanner(System.in);
        datos o = new datos();

        
        System.out.println("Seleccione el tipo de comida: ");
        System.out.println("1. Perro");
        System.out.println("2. Hamburgguesa");
        System.out.println("3. Salchipapa");
        System.out.println("4. Perra");
        System.out.println("---------------------");

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
            o.setPrecio(20.000);
        else if(o.getTipoComida() == "Perro" && o.getTamaño() == "Mediano")
            o.setPrecio(15.000);
        else if(o.getTipoComida() == "Perro" && o.getTamaño() == "Pequeño")
            o.setPrecio(10.000);
            
        if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Grande")
            o.setPrecio(25.000);
        else if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Mediano")
            o.setPrecio(19.000);
        else if(o.getTipoComida() == "Hamburguesa" && o.getTamaño() == "Pequeño")
            o.setPrecio(14.000);

        if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Grande")
            o.setPrecio(22.000);
        else if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Mediano")
            o.setPrecio(16.000);
        else if(o.getTipoComida() == "Salchipapa" && o.getTamaño() == "Pequeño")
            o.setPrecio(11.000);

        if(o.getTipoComida() == "Perra" && o.getTamaño() == "Grande")
            o.setPrecio(26.000);
        else if(o.getTipoComida() == "Perra" && o.getTamaño() == "Mediano")
            o.setPrecio(20.000);
        else if(o.getTipoComida() == "Perra" && o.getTamaño() == "Pequeño")
            o.setPrecio(15.000);


            m[i][j] = o;
           
            return m;
          
    

    }

}

package coneccionconsqlserver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.util.Scanner;
/**
 *
 * @author chumo
 */
public class ConeccionconSqlserver {

    private static Connection conect;
    public static void main(String[] args) {
        // TODO code application logic here
        //jdbc:sqlserver://localhost;databaseName=AdventureWorks;integratedSecurity=true;
        Scanner leer= new Scanner(System.in);
        
        String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Biblioteca;integratedSecurity=true;";
        try(Connection connection = DriverManager.getConnection(connectionUrl);){
           System.out.println("Conectado");
           int idlibro;
           String nombre;
           System.out.println("Ingresa el id del libro");
           idlibro=leer.nextInt();
           System.out.println("Ingresa el nombre del libro");
           nombre=leer.next();
           CallableStatement st= connection.prepareCall("{call spadd(?,?)}");
           st.setInt(1,idlibro);
           st.setString(2,nombre);
           st.execute();
           System.out.println("Registro insertado con exito");
           connection.close();
           

           
} 
catch (SQLException ex) 
{
  System.out.println(ex);
}
     }
    public void actualizar(){
        Scanner leer= new Scanner(System.in);
        int a;
        String b;
        System.out.println("Ingresa el id del libro a modificar");
        a=leer.nextInt();
        System.out.println("Ingresa el nombre del libro amodificar");
        b=leer.next();
        
}
    
}

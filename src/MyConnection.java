
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Sandu
 */
public class MyConnection {
    //functie care creeaza conexiunea
    public static Connection getConnection(){
        
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver"); //se initializeaza conectorul JAR
            
           con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "1234"); 
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con; //se returneaza conexiunea
    }
    
}

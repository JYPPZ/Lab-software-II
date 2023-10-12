package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    private Connection conn;
    private static DBConnection dbc;
    private DBConnection() {

    }

    public static DBConnection getDBConnection() {
        if (dbc == null) {
            dbc = new DBConnection();
        }
        return dbc;
    }

    public void comprobarIntancia(DBConnection inst){
        System.out.println("Codigo de Instancia: "+inst.hashCode());
    }

    public void connect(String url) {
        // SQLite connection string
        //String url = "jdbc:sqlite:./myDatabase.db"; //Para Linux/Mac
        //String url = "jdbc:sqlite:C:/sqlite/db/myDatabase.db"; //Para Windows
        //String url = "jdbc:sqlite::memory:";

        try {
            conn = DriverManager.getConnection("jdbc:sqlite:"+url+".db");

        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

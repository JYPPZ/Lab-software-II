package program;

import connection.DBConnection;

public class principal {
    public static void main(String[] args) {
        //primera instancia
        DBConnection conn = DBConnection.getDBConnection();
        conn.connect("empleados");
        conn.comprobarIntancia(conn);
        conn.disconnect();
        //segunda instancia
        DBConnection conn2 = DBConnection.getDBConnection();
        conn2.connect("nomina");
        conn2.comprobarIntancia(conn2);
        conn2.disconnect();
    }
}

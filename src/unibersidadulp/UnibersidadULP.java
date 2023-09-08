package unibersidadulp;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UnibersidadULP {

    public static void main(String[] args) {

        try {
          
            // cargamos el Driver
            
            Class.forName("org.mariadb.jdbc.Driver");
            
            // Creammos la conexion
            
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/unibersidadulp","root", "");
             
            // creamos una sentencia sql 
            //String sql = "INSERT INTO alumno ( dni, apellido, nombre, fechaNacimiento, estado) VALUES (25487369,'Jerez','Pablo', '1992-12-5','true')";
            
            // Creamos un objeto Statement para mandar la consulta  
            //PreparedStatement st = con.prepareStatement(sql);
            
            // ejecutamos la consulta creando un alumno nuevo en la tabla alumno
            //st.executeUpdate();
            
            //st.close();
            
            //-------------- creamos una materia------------
            
            /*String sql = "INSERT INTO materia ( nombre, año, estado) VALUES ( 'Polimorfismo', 2020, true)";
            
            PreparedStatement st = con.prepareStatement(sql);
            st.executeUpdate();
            
            st.close();*/
            
            // hacemos un select para filtrar los alumnos que tienen una nota mayor a 8 
            
            /*String sql = "SELECT * FROM alumno JOIN inscripcion ON (alumno.idAlumno = inscripcion.idAlumno) WHERE nota > 8";
            PreparedStatement st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
           
            while(rs.next()){
                
                System.out.println("dni: " + rs.getInt("dni")+ ", apellido: "+rs.getString("apellido")+ ", nombre: "+rs.getString("nombre")+ ", fecha nac: " +rs.getDate("fechaNacimiento")+", estado: "+ rs.getBoolean("estado"));
            }*/
           
           // eliminamos un alumno de la tabla alumno
           
           /*try{
           String consulta = "DELETE FROM inscripcion WHERE idInscripto = 10";
           
           PreparedStatement st = con.prepareStatement(consulta);
           
           int movimiento = st.executeUpdate();
               System.out.println("movimiento: "+ movimiento);
           st.close();
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null, "No se puede eliminar un alumno... ");
              
           }*/
            
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar Driver" + ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion" + ex.getMessage());
        }

    }

}

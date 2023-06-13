package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import controller.Nequi;

public class NequiDao {
   
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

    public int registrar(NequiVo Nequi) throws SQLException {
        sql = "INSERT INTO Nequi(nombre_Usua ,apellido_Usua,telefono_Usua,contrasena_Usua,estado_Usua) values(?,?,?,?,?)";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, Nequi.getNombre_Usua());
            ps.setString(2, Nequi.getApellido_Usua());
            ps.setInt(3, Nequi.getTelefono_Usua());
            ps.setInt(4, Nequi.getContrasena_Usua());
            ps.setBoolean(5,Nequi.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se registró el  usuario en Nequi correctamente");
        } catch (Exception e) {
            System.out.println("Error en el registro " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }


    /*LISTAR  */
     public List<NequiVo> listar() throws SQLException {
        List<NequiVo> Nequi = new ArrayList<>();
        sql = "select * from Nequi";
        System.out.println(sql);
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            System.out.println(ps);
            while (rs.next()) {
                NequiVo r = new NequiVo();
                
                r.setId_Usuarios(rs.getInt("Id_Usuarios"));
                r.setNombre_Usua(rs.getString("Nombre_Usua"));
                r.setApellido_Usua(rs.getString("Apellido_Usua"));
                r.setTelefono_Usua(rs.getInt("Telefono_Usua"));
                r.setContrasena_Usua(rs.getInt("Contrasena_Usua"));
                r.setEstado_Usua(rs.getBoolean("Estado_Usua"));
                Nequi.add(r);
                System.out.println(ps);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
        } finally {
            con.close();
        }

        return Nequi;
    }


    /*ACTUALIZAR  */
    public int modificar(NequiVo Nequi) throws SQLException {
        sql = "UPDATE Nequi SET nombre_Usua=?,apellido_Usua=?,telefono_Usua=?,contrasena_Usua=?,estado_Usua=? WHERE Id_Usuarios=?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            //setId_Usuarios
            ps.setInt(1, Nequi.getId_Usuarios());
            ps.setString(2, Nequi.getNombre_Usua());
            ps.setString(3, Nequi.getApellido_Usua());
            ps.setInt(4, Nequi.getTelefono_Usua());
            ps.setInt(5, Nequi.getContrasena_Usua());
            ps.setBoolean(6,Nequi.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se cambio el Usuario correctamente");
        } catch (Exception e) {
            System.out.println("Error en la actualizacion " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }

   
   
}

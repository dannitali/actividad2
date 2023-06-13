package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import controller.Daviplata;

public class DaviplataDao {
   
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

    public int registrar(DaviplataVo Daviplata) throws SQLException {
        sql = "INSERT INTO Daviplata(nombre_Usua ,apellido_Usua,telefono_Usua,contrasena_Usua,estado_Usua) values(?,?,?,?,?)";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, Daviplata.getNombre_Usua());
            ps.setString(2, Daviplata.getApellido_Usua());
            ps.setInt(3, Daviplata.getTelefono_Usua());
            ps.setInt(4, Daviplata.getContrasena_Usua());
            ps.setBoolean(5,Daviplata.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se registró el  usuario en Daviplata correctamente");
        } catch (Exception e) {
            System.out.println("Error en el registro " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }


    /*LISTAR  */
     public List<DaviplataVo> listar() throws SQLException {
        List<DaviplataVo> Daviplata = new ArrayList<>();
        sql = "select * from Daviplata";
        System.out.println(sql);
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            System.out.println(ps);
            while (rs.next()) {
                DaviplataVo r = new DaviplataVo();
                
                r.setId_Usuarios(rs.getInt("Id_Usuarios"));
                r.setNombre_Usua(rs.getString("Nombre_Usua"));
                r.setApellido_Usua(rs.getString("Apellido_Usua"));
                r.setTelefono_Usua(rs.getInt("Telefono_Usua"));
                r.setContrasena_Usua(rs.getInt("Contrasena_Usua"));
                r.setEstado_Usua(rs.getBoolean("Estado_Usua"));
                Daviplata.add(r);
                System.out.println(ps);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
        } finally {
            con.close();
        }

        return Daviplata;
    }


    /*ACTUALIZAR  */
    public int modificar(DaviplataVo Daviplata) throws SQLException {
        sql = "UPDATE Daviplata SET nombre_Usua=?,apellido_Usua=?,telefono_Usua=?,contrasena_Usua=?,estado_Usua=? WHERE Id_Usuarios=?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            //setId_Usuarios
            ps.setInt(1, Daviplata.getId_Usuarios());
            ps.setString(2, Daviplata.getNombre_Usua());
            ps.setString(3, Daviplata.getApellido_Usua());
            ps.setInt(4, Daviplata.getTelefono_Usua());
            ps.setInt(5, Daviplata.getContrasena_Usua());
            ps.setBoolean(6,Daviplata.getEstado_Usua());
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

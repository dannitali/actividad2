package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.UnsupportedAudioFileException;

import controller.Usuarios;

public class UsuariosDao {
   
    Connection con; //objeto de conexión
    PreparedStatement ps; //preparar sentencias
    ResultSet rs; // almacenar consutas
    String sql=null;
    int r; //cantidad de filas que devuelve una sentencia

    public int registrar(UsuariosVo Usuarios) throws SQLException {
        sql = "INSERT INTO Usuarios(nombre_Usua ,apellido_Usua,telefono_Usua,correo_Usua,contraseña_Usua,estado_Usua) values(?,?,?,?,?,?)";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            ps.setString(1, Usuarios.getNombre_Usua());
            ps.setString(2, Usuarios.getApellido_Usua());
            ps.setInt(3, Usuarios.getTelefono_Usua());
            ps.setString(4, Usuarios.getCorreo_Usua());
            ps.setInt(5, Usuarios.getContraseña_Usua());
            ps.setBoolean(6,Usuarios.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se registró el  usuario correctamente");
        } catch (Exception e) {
            System.out.println("Error en el registro " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }


    /*LISTAR  */
     public List<UsuariosVo> listar() throws SQLException {
        List<UsuariosVo> Usuarios = new ArrayList<>();
        sql = "select * from Usuarios";
        System.out.println(sql);
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(sql);
            System.out.println(ps);
            while (rs.next()) {
                UsuariosVo r = new UsuariosVo();
                
                r.setId_Usuarios(rs.getInt("Id_Usuarios"));
                r.setNombre_Usua(rs.getString("Nombre_Usua"));
                r.setApellido_Usua(rs.getString("Apellido_Usua"));
                r.setTelefono_Usua(rs.getInt("Telefono_Usua"));
                r.setCorreo_Usua(rs.getString("Correo_Usua"));
                r.setContraseña_Usua(rs.getInt("Contraseña_Usua"));
                r.setEstado_Usua(rs.getBoolean("Estado_Usua"));
                Usuarios.add(r);
                System.out.println(ps);
            }
            ps.close();
            System.out.println("consulta exitosa");
        } catch (Exception e) {
            System.out.println("La consulta no pudo ser ejecutado " + e.getMessage().toString());
        } finally {
            con.close();
        }

        return Usuarios;
    }


    /*ACTUALIZAR  */
    public int modificar(UsuariosVo Usuarios) throws SQLException {
        sql = "UPDATE Usuarios SET Id_Usuarios=?,nombre_Usua=?,apellido_Usua=?,telefono_Usua=?,correo_Usua=?,contraseña_Usua=?,estado_Usua=? WHERE Id_Usuarios=?";

        try {
            con = Conexion.conectar(); // abrir conexión
            ps = con.prepareStatement(sql); // preparar sentencia
            //setId_Usuarios
            ps.setInt(1, Usuarios.getId_Usuarios());
            ps.setString(2, Usuarios.getNombre_Usua());
            ps.setString(3, Usuarios.getApellido_Usua());
            ps.setInt(4, Usuarios.getTelefono_Usua());
            ps.setString(5, Usuarios.getCorreo_Usua());
            ps.setInt(6, Usuarios.getContraseña_Usua());
            ps.setBoolean(7,Usuarios.getEstado_Usua());
            System.out.println(ps);
            ps.executeUpdate(); // Ejecutar sentencia
            ps.close(); // cerrar sentencia
            System.out.println("Se cambio el rol correctamente");
        } catch (Exception e) {
            System.out.println("Error en la actualizacion " + e.getMessage().toString());
        } finally {
            con.close();// cerrando conexión
        }
        return r;
    }
   
}

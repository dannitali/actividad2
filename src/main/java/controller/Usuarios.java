package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.UsuariosDao;
import models.UsuariosVo;

public class Usuarios extends HttpServlet{
    UsuariosVo r=new UsuariosVo();
    UsuariosDao rd=new UsuariosDao();


     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoGet");
         String accion = req.getParameter("accion");
        System.out.println(accion);

        switch (accion) {

            case "index":
            req.getRequestDispatcher("index.jsp").forward(req, resp);
            break;

            case "registrar":
            req.getRequestDispatcher("registrar.jsp").forward(req, resp);
            break;

            case "iniciarSesion":
            req.getRequestDispatcher("iniciarSesion.jsp").forward(req, resp);
            break;

            case "iniciarDavi":
            req.getRequestDispatcher("iniciarDavi.jsp").forward(req, resp);
            break;

            case "Nequi":
            req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
            break;

            case "daviPlata":
            req.getRequestDispatcher("daviPlata.jsp").forward(req, resp);
            break;

            case "dinero":
            req.getRequestDispatcher("dinero.jsp").forward(req, resp);
            break;

            case "recarga":
            req.getRequestDispatcher("recarga.jsp").forward(req, resp);
            break;

            case "consulta":
            req.getRequestDispatcher("consulta.jsp").forward(req, resp);
            break;

            case "retirar":
            req.getRequestDispatcher("retirar.jsp").forward(req, resp);
            break;
            case "Usuarios":
                req.getRequestDispatcher("Usuarios.jsp").forward(req, resp);
                break;
            case "Usuario-add":
                req.getRequestDispatcher("Usuario-add.jsp").forward(req, resp);
                break;
            case "Usuario-modificar":
                req.getRequestDispatcher("Usuario-modificar.jsp").forward(req, resp);
                break;
            case "abrirForm":
                abrirForm(req, resp);
                break;
            case "listar":
                listar(req, resp);
                break;
            case "modificar":
                modificar(req, resp);
                break;
        
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Entró al DoPost");
        String accion = req.getParameter("accion");
        System.out.println("accion");
        switch (accion) {
            case "add":
                // nombre_Usua = req.getParameter("Nombre_Usua");
                add(req, resp);
                break;

            case "modificar":
            System.out.println("Acabas de entrar al actualizar");
                modificar(req, resp);
                break;


            case "Daviplata":
                String usernamer = req.getParameter("username");
                String passwordr = req.getParameter("password");

                if (usernamer.equals("karen") && passwordr.equals("876")) {
                    // Usuario y contraseña válidos
                    req.getRequestDispatcher("Daviplata.jsp").forward(req, resp);
                } else {
                    // Usuario o contraseña inválidos
                    req.getRequestDispatcher("Daviplataa.jsp").forward(req, resp);
                }
                break;

            case "Nequi":
                String usernamerr = req.getParameter("username");
                String passwordrr = req.getParameter("password");

                if (usernamerr.equals("karen") && passwordrr.equals("1223")) {
                    // Usuario y contraseña válidos
                    req.getRequestDispatcher("Nequi.jsp").forward(req, resp);
                } else {
                    // Usuario o contraseña inválidos
                    req.getRequestDispatcher("Nequii.jsp").forward(req, resp);
                }
                break;

        }
    }

    private void abrirForm(HttpServletRequest req, HttpServletResponse resp) {
        try {
            req.getRequestDispatcher("Usuario-add.jsp").forward(req, resp);
            System.out.println("El formulario ha sido abierto");
        } catch (Exception e) {
            System.out.println("El formulario NO ha sido abierto" + e.getMessage().toString());
        }
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        r = new UsuariosVo();

        String nombre_Usua = req.getParameter("Nombre_Usua");
        String apellido_Usua = req.getParameter("Apellido_Usua");
        String telefono_Usua = req.getParameter("Telefono_Usua");
        String correo_Usua = req.getParameter("Correo_Usua");
        String password = req.getParameter("password_u");
        System.out.println("La contraseña recibida afuera del if fue " + password);
        boolean estado_Usua = false;

        if (nombre_Usua != null) {
            r.setNombre_Usua(req.getParameter("Nombre_Usua"));
        }
        if (apellido_Usua != null) {
            r.setApellido_Usua(req.getParameter("Apellido_Usua"));
        }
        if (telefono_Usua != null) {
            int telefono = Integer.parseInt(telefono_Usua);
            r.setTelefono_Usua(telefono);
        }
        if (correo_Usua != null) {
            r.setCorreo_Usua(req.getParameter("Correo_Usua"));
        }
        if (password != null) {
            int i_password = Integer.parseInt(password);
            r.setContraseña_Usua(i_password);
            System.out.println("La contraseña recibida dentro del if fue " + password);
        }
        if (req.getParameter("Estado_Usua") != null) {
            r.setEstado_Usua(true);
        } else {
            r.setEstado_Usua(false);
        }
        try {
            rd.registrar(r);
            // sys
        } catch (Exception e) {
            System.out.println("Error en el registro del usuario" + e.getMessage().toString());
        }

    }

    private void modificar(HttpServletRequest req, HttpServletResponse resp) {
        r = new UsuariosVo();

        String id_Usuarios = req.getParameter("Id_Usuarios");
        String nombre_Usua = req.getParameter("Nombre_Usua");
        String apellido_Usua = req.getParameter("Apellido_Usua");
        String telefono_Usua = req.getParameter("Telefono_Usua");
        String correo_Usua = req.getParameter("Correo_Usua");
        String password = req.getParameter("password_u");
        System.out.println("La contraseña recibida afuera del if fue " + password);
        boolean estado_Usua = false;

         if (id_Usuarios != null) {
            r.setNombre_Usua(req.getParameter("Id_Usuarios"));
        }
        if (nombre_Usua != null) {
            r.setNombre_Usua(req.getParameter("Nombre_Usua"));
        }
        if (apellido_Usua != null) {
            r.setApellido_Usua(req.getParameter("Apellido_Usua"));
        }
        if (telefono_Usua != null) {
            int telefono = Integer.parseInt(telefono_Usua);
            r.setTelefono_Usua(telefono);
        }
        if (correo_Usua != null) {
            r.setCorreo_Usua(req.getParameter("Correo_Usua"));
        }
        if (password != null) {
            int i_password = Integer.parseInt(password);
            r.setContraseña_Usua(i_password);
            System.out.println("La contraseña recibida dentro del if fue " + password);
        }
        if (req.getParameter("Estado_Usua") != null) {
            r.setEstado_Usua(true);
        } else {
            r.setEstado_Usua(false);
        }
        try {
            rd.modificar(r);
            // sys
        } catch (Exception e) {
            System.out.println("Error en la inserción del registro " + e.getMessage().toString());
        }

    }

    private void listar(HttpServletRequest req, HttpServletResponse resp) {
        try {
            List Usuarios = rd.listar();
            req.setAttribute("Usuarios", Usuarios);
            req.getRequestDispatcher("Usuarios.jsp").forward(req, resp);
            System.out.println("Datos listados correctamente");
        } catch (Exception e) {
            System.out.println("Hay problemas al listar los datos " + e.getMessage().toString());
        }
    }

   

}

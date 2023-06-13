<!DOCTYPE html <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>>
<html>

<head>
    <title>Usuario</title>
    <!-- Enlace a Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="assets/css/estilos3.css">
    <style>
        /* Estilos personalizados */
        body {
            background-color: #f2f2f2;
        }

        .navbar {
            background-color: #2a0374;
            width: 1500px;
            height: 70px;
        }

        .nav-link {
            color: #fff;
        }

        .form-control:focus {
            border-color: #2a0374;
            box-shadow: none;
        }

        .btn-primary {
            background-color: #2a0374;
            border-color: #2a0374;
        }

        .btn-primary:hover {
            background-color: #2a0374;
            border-color: #2a0374;
        }

        .card {
            margin-top: 50px;
            border: none;
            border-radius: 10px;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }

        .card-header {
            background-color: #2a0374;
            color: #fff;
            border-radius: 10px 10px 0 0;
            text-align: center;
        }
    </style>
</head>

<body>
    <!-- Menú de navegación -->
    <nav class="navbar navbar-expand-lg navbar-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Bolsillo Digital</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ml-auto">

                    <li class="nav-item active">
                        <a class="nav-link" href="Usuarios?accion=index">Salir</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

    <br>
    <br>
    <br>
    <body>
        <center>
            <div id="formContent">
                <h1>Modificar Usuarios</h1>

            <form method="post" action="Usuarios">

            <div class="form-group">
                <label for="Nombre_Usua">Nombre</label>
                <input type="text" name="Nombre_Usua" id="Nombre_Usua" class="Nombre" value="${Usuarios.nombre_Usua}" />
            </div>
            <div class="form-group">
                <label for="Apellido_Usua">Apellido</label>
                <input type="text" name="apellido_Usua" id="Apellido_Usua" class="Apellido"
                    value="${Usuarios.apellido_Usua}">
            </div>
            <div class="form-group">
                <label for="Telefono_Usua">Telefono</label>
                <input type="text" name="Telefono_Usua" id="Telefono_Usua" class="Telefono"
                    value="${Usuarios.telefono_Usua}">
            </div>
            <div class="form-group">
                <label for="Correo_Usua">Correo</label>
                <input type="text" name="Correo_Usua" id="Correo_Usua" class="Correo" value="${Usuarios.correo_Usua}">
            </div>
            <div class="form-group">
                <label for="password_u">Contraseña</label>
                <input type="password" name="password_u" id="password_u" class="Contraseña"
                    value="${Usuarios.contraseña_Usua}">
            </div>
            <div class="Id_Usuarios">
                <label for="Nombre_Usua">Id</label>
                <input type="number" class="form-control" name="Id_Usuarios" value="${Usuarios.Id_Usuarios}" />
            </div
            <div class="form-check">

                <input type="checkbox" name="Estado_Usua" id="Estado_Usua" checked class="Estado_Usua">
                <c:out value="${Usuarios.estado_Usua==false ? 'unchecked':'checked'}" default="" />>
                <label class="form-check-label" for="chkestado">
                    ${Usuarios.estado_Usua==false ? 'Marca la casilla para activar':'Desmarca la casilla para
                    Inactivar'}
                </label>
            </div>

            <br>
            <div>
                <button type="submit" class="btn btn-primary" name="accion" value="modificar">Guardar</button>
            </div>
<br>
<br>
        </form>
        </div>
        </div>
    </div>
    </center>
    </body>
    <br>
    <center>
        <footer>
            <P>
                <b>INFORMACION DE CONTACTO</b>
                <br><br>
                Correo Electrinico: dannavelhernandez@gmail.com<br>
                Telefono:3208228558 <br><br>
                <b> Copyright &popy; 2023 - BOGOTA D.C</b>
            </P>
   
    </footer>
    </center>
</body>

</html>
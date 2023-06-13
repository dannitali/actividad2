<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Consultar</title>
    <link rel="stylesheet" href="assets/css/consulta.css">

</head>

<body>

    
    <form action="bolsillo" method="post" class="form-box animated fadeInUp">
        <h1 class="form-title">Saldo Actual</h1>
            <h6>Su saldo es : </h6>
            <p><%=request.getAttribute("saldoofinal")%>
            </p>
        <button type="submit" name="accion" ><a href="bolsillo?accion=dinero">Volver</a></button>
    </form>
</body>
</html>         
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">


<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>recargar</title>
    <link rel="stylesheet" href="assets/css/recarga.css">

</head>

<body>


    
    <form action="bolsillo"  method="post" class="form-box animated fadeInUp">
    <h1 class="form-title">Recargar</h1>
        <label for="Recarga">Saldo a Recargar</label>
        <input type="text" name ="Recarga" >
        <input type="submit" name="accion" value="Recargar"> 
        <input type="submit" name="accion" value="ConsultarSaldo"> 
    </form>
    
</body>
</html>
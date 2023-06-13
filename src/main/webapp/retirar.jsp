<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>retirar</title>
    <link rel="stylesheet" href="assets/css/retirar.css">

</head>

<body>

  
    
    <form action="bolsillo"  method="post" class="form-box animated fadeInUp">
    <h1 class="form-title">Retirar</h1>
        <label for="retirar">Saldo a Retirar</label>
        <input type="text" name ="retirar" >
        <div class="boton">
            <input type="submit" name="accion" value="Retirar">
            <input type="submit" name="accion" value="ConsultarSaldo"> 
        </div>       
    </form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<title>Dinero</title>
	<link rel="stylesheet" href="assets/css/dinero.css">

</head>
<body>
	<!--Tarjetas-->
<div class="title-cards">
		<h2>Acciones a realizar</h2>
	</div>
<div class="container-card">
	
<div class="card">
	<figure>
		<img src="https://st2.depositphotos.com/5266903/12112/i/600/depositphotos_121126418-stock-photo-euro-atm-flat-glyph-icon.jpg">
	</figure>
	<div class="contenido-card">
		<h3>Consultar</h3>
		<p>Verifica la cantidad de dinero que se encuentra en su cuenta asociada a la aplicación .</p>
		<a href="bolsillo?accion=consulta">Ir</a>
	</div>
</div>
<div class="card">
	<figure>
		<img src="https://img.freepik.com/vector-premium/diseno-plano-cajero-automatico-tarjeta-credito-pin-introducido_168129-7.jpg">
	</figure>
	<div class="contenido-card">
		<h3>Retirar</h3>
		<p>Retire el dinero disponible en su cuenta asociada a la aplicación . </p>
        <br>
		<a href="bolsillo?accion=retirar">Ir</a>
	</div>
</div>
<div class="card">
	<figure>
		<img src="https://img.freepik.com/vector-premium/reposicion-saldo-dinero-movil-servicio-linea-recarga_39422-180.jpg">
	</figure>
	<div class="contenido-card">
		<h3>Recargar</h3>
		<p>Agregue dinero a su cuenta asociada a la aplicación que se encuentra usando . </p>
        <br>
		<a href="bolsillo?accion=recarga">Ir</a>
	</div>
</div>
</div>

</body>
</html>
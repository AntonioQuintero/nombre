<html>
<head>
<title></title>

<script type="text/javascript">
  function copiar()
  {
    mensaje=document.getElementById("Nombre").value;
    mensaje2=document.getElementById("Apellido").value;
    div = document.getElementById('impresion');
	div.innerHTML += '<br>' + 'Tu nombre es: ' +   mensaje +" " +  mensaje2;

  }
</script>
</head>

<body>
<form action="/login" method="post">
    Nombre:<input type="text" name="nombre" id="Nombre">
    Apellido:<input type="text" name="apellido" id="Apellido">
    <input type="button" value="Ver" onclick="copiar()">
    <div id="impresion">
</div>

</form>

</body>
</html>

document.addEventListener('DOMContentLoaded',function(){
    let xhr = new XMLHttpRequest();
    
    // Activamos el indicador Ajax antes de realizar la petición.
    document.getElementById('indicador').innerHTML = '<img src="state.gif"/>';
    
    //Al emplear el método POST, los parámetros se pasan en el método send como nombre=valor:
    xhr.open('POST', 'procesar.php', true);
    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
            document.getElementById('indicador').innerHTML = "";
            document.getElementById('resultados').innerHTML = xhr.responseText;
        }
    };
    
    // En las peticiones POST tenemos que enviar en la cabecera el Content-Type ya que los datos se envían formando parte de la cabecera. La cadena "application/x-www-form-urlencoded" indica que los datos en el cuerpo de la solicitud están codificados en el formato de datos de formulario URL-encodificados. En este formato, los datos se envían como pares clave-valor separados por "&", y los valores de las claves y los datos se codifican para que sean seguros para ser transmitidos a través de la web:
    
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    xhr.send('nombre=Teresa&apellidos=Blanco Ferreiro');
});
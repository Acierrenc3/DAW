document.addEventListener('DOMContentLoaded',function(){
    let xhr = new XMLHttpRequest();
    
    xhr.open('GET','catalogo.xml',true);
    xhr.onreadystatechange = function(){
        if(xhr.readyState === 4 && xhr.status === 200){
            let datos = xhr.responseXML;
            // Tenemos que recorrer el fichero XML empleando los métodos del DOM
            // Array que contiene todos los CD's del fichero XML
            let CDs = datos.getElementsByTagName("CD");
            
            // En la variable salida compondremos el código HTML de la tabla a imprimir.
            let salida = "<table border='1'><tr><th>Titulo</th><th>Artista</th><th>Año</th></tr>";
            
            // Hacemos un bucle para recorrer todos los elementos CD.
            for (i=0;i<CDs.length;i++){
                salida += "<tr>";
                // Para cada CD leemos los datos:
                let titulos = CDs[i].getElementsByTagName("TITLE");
                salida += "<td>" + titulos[0].firstChild.nodeValue + "</td>";
                
                let artistas = CDs[i].getElementsByTagName("ARTIST");
                salida += "<td>" + artistas[0].firstChild.nodeValue + "</td>";
                
                let anhos = CDs[i].getElementsByTagName("YEAR");
                salida += "<td>" + anhos[0].firstChild.nodeValue + "</td>";
                
                //Se seguiría con el resto de datos/etiquetas.
                // Cerramos la fila.
                salida += "</tr>";                
            }
            // Cuando ya no hay más Cd's cerramos la tabla.
            salida += "</table>";
            // Imprimimos la tabla dentro del contenedor resultados.
            document.getElementById("resultados").innerHTML = salida;
        }
    }
    xhr.send();
});
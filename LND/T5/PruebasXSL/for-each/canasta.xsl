<xsl:stylesheet version = "1.0"
xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">

<!-- En el template colocamos las reglas que se aplican a los nodos que se llegan a encontrar.
    Match es usado para asociar el template con un elemento XML, si usamos / eso significa que es
    todo el documento.
    name es opcional y representa al nombre del template-
    mode es opcional y permite a los elementos ser procesados multiples veces para producir diferentes resultados.
    priority es opcional e indica la prioridad que tendrá el template -->
<xsl:template match="/">
    <!-- Aqui creamos el documento html -->
    <html>
        <body>
        <h2>Canasta</h2>
        <!-- Creamos una tabla con sus encabezados de columna -->
        <table border = "1">
            <tr bgcolor = "#a0a0ff">
                <th>Id Producto</th> <th>Nombre</th><th>Origen</th><th>Cantidad</th><th>Coste</th>
            </tr>
            <!-- Tenemos un iterador for-each que recorrerá cada elemento de dentro de canasta -->
            <xsl:for-each select="canasta/producto">
                    <tr>
                        <td><xsl:value-of select="@idProducto"></xsl:value-of></td>
                        <td><xsl:value-of select="nombre"></xsl:value-of></td>
                        <td><xsl:value-of select="origen"></xsl:value-of></td>
                        <td><xsl:value-of select="cantidad"></xsl:value-of></td>
                        <td><xsl:value-of select="coste"></xsl:value-of></td>
                    </tr>
            </xsl:for-each>
        </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>
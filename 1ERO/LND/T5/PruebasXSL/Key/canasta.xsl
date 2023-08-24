<xsl:stylesheet version = "1.0"
xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
<xsl:key name="busquedaOrigen" match="producto" use="origen"></xsl:key> <!-- El atributo KEY se usa al principio del  documento, antes del template inicial -->
<xsl:template match="/">
    <html>
        <body>
        <h2>Canasta</h2>
        <table border = "1">
            <tr bgcolor = "#a0a0ff">
                <th>Id Producto</th> <th>Nombre</th><th>Origen</th><th>Cantidad</th><th>Coste</th><th></th>
            </tr>
            <xsl:for-each select="key('busquedaOrigen','Colombia')">  <!--Despues en el For-each se selecciona los atributos de KEY -->
                    <tr>
                        <td><xsl:value-of select="@idProducto"></xsl:value-of></td>
                        <td><xsl:value-of select="nombre"></xsl:value-of></td>
                        <td><xsl:value-of select="origen"></xsl:value-of></td>
                        <td><xsl:value-of select="cantidad"></xsl:value-of></td>
                        <td><xsl:value-of select="coste"></xsl:value-of></td>
                        <td>
                            <xsl:choose>
                                <xsl:when test="origen='Mexico'">Importado LatinoAmerica</xsl:when>
                                <xsl:when test="origen='Italia'">Importado Europa</xsl:when>
                                <xsl:otherwise>Importado Colombia</xsl:otherwise>
                            </xsl:choose>
                        </td>
                    </tr>
            </xsl:for-each>
        </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>

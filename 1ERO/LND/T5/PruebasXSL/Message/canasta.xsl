<xsl:stylesheet version = "1.0"
xmlns:xsl = "http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html>
        <body>
        <h2>Canasta</h2>
        <table border = "1">
            <tr bgcolor = "#a0a0ff">
                <th>Id Producto</th> <th>Nombre</th><th>Origen</th><th>Cantidad</th><th>Coste</th>
            </tr>
            <xsl:for-each select="canasta/producto">  
                <xsl:sort select="coste"/>
                    <xsl:if test="origen = ''">
                        <xsl:message terminate="no"/>
                        Dato Faltante, Finalizamos
                    </xsl:if>
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
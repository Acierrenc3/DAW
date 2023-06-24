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
                    <tr>
                        <td><xsl:apply-templates  select="@idProducto"/></td>
                        <td><xsl:apply-templates  select="nombre"/></td>
                        <td><xsl:apply-templates  select="origen"/></td>
                        <td><xsl:apply-templates  select="cantidad"/></td>
                        <td><xsl:apply-templates  select="coste"/></td>
                    </tr>
                </xsl:for-each>
                </table>
            </body>
        </html>
</xsl:template>
                    <xsl:template match="canasta/producto">
                        <td><xsl:apply-templates select="@idProducto"/></td>
                        <td><xsl:apply-templates select="nombre"/></td>
                        <td><xsl:apply-templates select="origen"/></td>
                        <td><xsl:apply-templates select="cantidad"/></td>
                        <td><xsl:apply-templates select="coste"/></td>
                    </xsl:template>
            <xsl:template match="@idProducto">
                <span style = "color:black;font-size:24;">
                    <xsl:value-of select="."/>
                </span>
                <br />
            </xsl:template>
            <xsl:template match="nombre">
                <span style = "color:lightblue;">
                    <xsl:value-of select="."/>
                </span>
                <br />
            </xsl:template>
            <xsl:template match="origen">
                <span style = "color:lightgreen;">
                    <xsl:value-of select="."/>
                </span>
                <br />
            </xsl:template>
            <xsl:template match="cantidad">
                <span style = "color:lightgray;">
                    <xsl:value-of select="."/>
                </span>
                <br />
            </xsl:template>
            <xsl:template match="coste">
                <span style = "color:lightpink;">
                    <xsl:value-of select="."/> €
                </span>
                <br />
            </xsl:template>
</xsl:stylesheet>
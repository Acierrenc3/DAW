<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="utf-8" indent="yes" method="html"
                doctype-system="about:legacy-compat" />
    <xsl:template match="/">
    <html>
        <head>
            <title>Lecturas Recomendadas para final del Curso</title>
        </head>
        <body>
            <h1>Lecturas Recomendadas</h1>
            <table>
            <tr bgcolor="olive">
            <th>ISBN</th><th>Título</th><th>Autor</th><th>Precio</th>
            </tr>
                <xsl:for-each select="libreria/libro">
                <xsl:sort select="autor"/>
                    <tr>
                        <td><xsl:value-of select="isbn"/></td>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="autor"/></td>
                        <td><xsl:value-of select="precio"/></td>
                        <xsl:choose>
                            <xsl:when test="precio &lt;= 40"><td class="green">Muy Asequible</td></xsl:when>
                            <xsl:when test="precio &lt;= 80"><td class="yellow">Asequible</td></xsl:when>
                            <xsl:when test="precio &lt;= 100"><td class="orange">Caro</td></xsl:when>
                            <xsl:otherwise><td class="pink">Me ha costao un riñón</td></xsl:otherwise>
                            <xsl:when test="precio &gt; 100"><td class="red">Me ha costao un Pulmon</td></xsl:when>
                        </xsl:choose>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>
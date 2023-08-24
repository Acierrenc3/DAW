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
            <tr bgcolor="lightgreen">
            <th>ISBN</th><th>Título</th><th>Autor</th><th>Num Paginas</th><th>Precio</th>   <!--Te Quedaste en el punto 5.5-->
            </tr>                                                                           <!--Te Quedaste en el punto 5.5-->
                <xsl:for-each select="libreria/libro">                                      <!--Te Quedaste en el punto 5.5-->
                <xsl:sort select="autor"/>
                    <tr>
                        <td><xsl:value-of select="isbn"/></td>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="autor"/></td>
                        <td><xsl:value-of select="numPaginas"/></td>
                        <td><xsl:value-of select="precio"/></td>
                        <xsl:choose>
                            <xsl:when test="numPaginas &gt; 150"><td class="red"></td></xsl:when>
                        </xsl:choose>
                    </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>

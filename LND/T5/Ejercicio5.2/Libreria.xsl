<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="utf-8" indent="yes" method="html"
                doctype-system="about:legacy-compat" />
    <xsl:template match="/">
    <html>
    <link href="Libreria.css" rel="stylesheet" type="text/css"/>
        <head>
            <title>Lecturas Recomendadas para final del Curso</title>
        </head>
        <body>
            <h1>Lecturas Recomendadas</h1>
            <table>
            <tr bgcolor="olive">
            <th>ISBN</th><th>Título</th><th>Autor</th><th>Precio</th><th>IGIC</th><th>TOTAL</th>
            </tr>
            <xsl:for-each select="libreria/libro[autor!='Albert Einstein']" >
                <xsl:if test="precio" order="ascending">
                    <tr>
                        <td><xsl:value-of select="isbn"/></td>
                        <td><xsl:value-of select="titulo"/></td>
                        <td><xsl:value-of select="autor"/></td>
                        <td><xsl:value-of select="precio"/></td>
                        <td><xsl:value-of select="igic"/></td>
                        <td><xsl:value-of select="total"/></td>
                    </tr>
                </xsl:if>
            </xsl:for-each>
            </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>
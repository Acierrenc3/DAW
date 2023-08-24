<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="utf-8" indent="yes" method="html"
        doctype-system="about:legacy-compat" />
    <xsl:template match="/">
    <html>
        <head>
            <title>Ejercicio 4.2.1</title>
        </head>
        <body>
            <h1>Países de habla Española</h1>
            <table>
                <tr bgcolor="lightblue">
                    <th>Nombre</th><th>Num.Lenguas</th><th>Num.Hab.</th><th>Densidad</th>
                </tr> 
                    <xsl:for-each select="countries/country[language='Spanish']">
                            <tr>
                                <td><xsl:value-of select="@name"></xsl:value-of></td>
                                <td><xsl:value-of select="language"></xsl:value-of></td>
                                <td><xsl:value-of select="@population"></xsl:value-of></td>
                                <td><xsl:value-of select="@population div @area"></xsl:value-of></td>
                            </tr>
                    </xsl:for-each>
            </table>
        </body>
    </html>
    </xsl:template>
</xsl:stylesheet>
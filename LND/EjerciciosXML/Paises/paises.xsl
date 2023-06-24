<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
<xsl:variable name="poblaciontotal" select="sum(/ciudades/ciudad/poblacion)" />    
<xsl:template match="/">
        <html>
            <head>
                <title>CIUDADES</title>
                <style>
                    *{text-align:center; margin:auto; margin-top: 20px; margin-bottom: 1px; }
                    table, h1 {margin:0;}
                    th {background-color: white; color: black;}
                    tr:nth-child(even) {background-color: lightgreen;}
                    tr:nth-child(odd) {background-color: lightgreen;}
                    td {text-align: left;}
                    th {border: 1px solid black;}
                    .derecha {text-align: right;}
                </style>
            </head>
                <body>
                    <table style="background-color:white" border="1" cellspacing="0">
                        <thead>
                            <tr>
                                <th colspan="6" cellspacing="">CIUDADES</th>
                            </tr>
                            <tr>
                                <th>Nombre</th><th>Pais</th><th>Continente</th><th>Poblacion</th>
                            </tr>
                        </thead>
                        <xsl:for-each select="ciudades/ciudad/nombre">
                        <tr>
                            <td><xsl:value-of select="."/></td>
                            <td><xsl:value-of select="../pais"/></td>
                            <td><xsl:value-of select="../pais/@continente"/></td>
                            <td><xsl:value-of select="../poblacion"/></td>
                        </tr>
                        </xsl:for-each>
                        <tr>
                            <td colspan="3">Poblacion Total</td>
                            <td><xsl:value-of select="$poblaciontotal"/></td>
                        </tr>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
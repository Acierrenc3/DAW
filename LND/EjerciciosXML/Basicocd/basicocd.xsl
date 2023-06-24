<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/">
        <html>
            <head>
                <title>EJ 5</title>
                <style>
                    *{text-align:center; margin:auto; margin-top: 20px; margin-bottom: 1px; }
                    table, h1 {margin:0;}
                    th {background-color: lightgray; color: black;}
                    tr:nth-child(even) {background-color: lightgreen;}
                    tr:nth-child(odd) {background-color: lightgreen;}
                    td {text-align: left;}
                    th {border: 1px solid black;}
                    .derecha {text-align: right;}
                </style>
            </head>
                <body>
                    <table style="background-color:white" border="1" cellspacing="0" cellpadding="2">
                    <thead>
                        <tr>
                            <th colspan="6">CDs EN OFERTA</th>
                        </tr>
                        <tr>
                            <th>Titulo</th><th>Artista</th><th>Pais</th><th>Discografica</th><th>Precio</th><th>Año</th>
                        </tr>
                    </thead>
                            <xsl:for-each select="CD_OFERTA/CD">
                                <tr>
                                    <td><xsl:value-of select="@titulo"></xsl:value-of></td>
                                    <td><xsl:value-of select="artista"></xsl:value-of></td>
                                    <td><xsl:value-of select="pais"></xsl:value-of></td>
                                    <td><xsl:value-of select="discografica"></xsl:value-of></td>
                                    <td><xsl:value-of select="precio"></xsl:value-of></td>
                                    <td><xsl:value-of select="Año"></xsl:value-of></td>
                                </tr>
                            </xsl:for-each>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
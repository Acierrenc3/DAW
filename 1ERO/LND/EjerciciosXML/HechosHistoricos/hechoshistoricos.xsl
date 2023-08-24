<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/">
        <html>
            <head>
                <title>HECHOS HISTORICOS</title>
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
                    <table style="background-color:white" border="1" cellspacing="0">
                        <thead>
                            <tr>
                                <th colspan="6" cellspacing="0">HECHOS HISTÓRICOS</th>
                            </tr>
                            <tr>
                                <th rowspan="2">Descripcion de cada hecho</th><th colspan="4">Fecha</th>
                            </tr>
                            <tr>
                                <th>Dia</th><th>Mes</th><th>Año</th>
                            </tr>
                        </thead>
                                <xsl:for-each select="/hechos_historicos/hecho/@descripcion">
                                <tr>
                                    <td><xsl:value-of select="."/></td>
                                    <td><xsl:value-of select="../fecha/dia"/></td>
                                    <td><xsl:value-of select="../fecha/mes"/></td>
                                    <td><xsl:value-of select="../fecha/año"/></td>
                                </tr>
                                </xsl:for-each>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
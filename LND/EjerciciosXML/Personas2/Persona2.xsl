<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
<xsl:variable name="sumtotal" select="sum(/fichas/ficha/sueldo)"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>FICHAS PERSONA</title>
                <style>
                    *{text-align:center; margin:auto; margin-top: 20px; margin-bottom: 1px; }
                    th {background-color: lightgray; color: black;}
                    td {text-align: left;}
                    th {border: 1px solid black;}
                    .derecha {text-align: right;}
                </style>
            </head>
                <body>
                    <table style="background-color:white" border="1" cellspacing="0">
                        <thead>
                            <tr>
                                <th colspan="7">FICHAS PERSONAS</th>
                            </tr>
                            <tr>
                                <th>Id</th><th>Nombre</th><th>Edad</th><th>Sueldo</th><th>Rango</th><th>R.Empresa</th>
                            </tr>
                        </thead>
                            <xsl:for-each select="fichas/ficha">
                                <xsl:sort select="sueldo" data-type="number" order="descending"/>
                                    <tr>
                                        <td><xsl:value-of select="@numero"/></td>
                                        <td><xsl:value-of select="nombre"/></td>
                                        <td><xsl:value-of select="edad"/></td>
                                        <td><xsl:value-of select="sueldo"/></td>
                                <xsl:choose>
                                    <xsl:when test="sueldo &lt;= 950"><td style="background-color:green">Salario Base</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 1600"><td style="background-color:yellow">Salario Base + Dietas</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 1950"><td style="background-color:lightblue">SB+Dietas+Transporte</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 2500"><td style="background-color:pink">Salario Maximo</td></xsl:when>
                                </xsl:choose>
                                <xsl:choose>
                                    <xsl:when test="sueldo &lt;= 950"><td style="background-color:lightgreen">Rango D</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 1600"><td style="background-color:lightgreen">Rango C</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 1950"><td style="background-color:lightgreen">Rango B</td></xsl:when>
                                    <xsl:when test="sueldo &lt;= 2500"><td style="background-color:lightgreen">Rango A</td></xsl:when>
                                </xsl:choose>
                                    </tr>
                            </xsl:for-each>
                            <tr>
                                <td colspan="3">SueldoTotal</td><td><xsl:value-of select="$sumtotal"/></td>
                            </tr>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
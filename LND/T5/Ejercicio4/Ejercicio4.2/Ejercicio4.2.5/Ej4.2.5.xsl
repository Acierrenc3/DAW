<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="utf-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:variable name="masdensidad" select="max(/countries/country/(@population div @area))"></xsl:variable>
    <xsl:variable name="menosdensidad" select="min(/countries/country/(@population div @area))"></xsl:variable>
    <xsl:variable name="nombremas" select="/countries/country[(@population div @area)=$masdensidad]/@name"></xsl:variable>
    <xsl:variable name="nombremenos" select="/countries/country[(@population div @area)=$menosdensidad]/@name"></xsl:variable>
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="utf-8" />
                <title>Listado Paises</title>
                <style>
                    table, th, td {
                        font-family: Arial, Helvetica, sans-serif;    
                        border: 1px solid black; 
                        margin-left: auto;
                        margin-right: auto;
                    }
                    th {
                        background-color: lightblue
                    }
                    td {
                        background-color: lightgray
                    }
                    h1{
                        text-align: center;
                        text-decoration: underline;
                    }
                </style>
            </head>
            <body>
                <h1 class="textocentro textosubrrayado">Paises con Mayor y Menor Densidad de Población</h1>
                <table>
                    <thead>
                        <tr style="background-color: lightblue; color: blue">
                            <th>Pais</th>
                            <th>Densidad de Población</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>
                                <xsl:value-of select="$nombremas"/>
                            </td>
                            <td style= "text-align: right">
                                <xsl:value-of select="format-number($masdensidad,'0.00')"/>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <xsl:value-of select="$nombremenos"/>
                            </td>
                            <td style= "text-align: right">
                                <xsl:value-of select="format-number($menosdensidad,'0.00')"/>
                            </td>
                        </tr>
                    </tbody>
                    <tfooter>
                    </tfooter>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
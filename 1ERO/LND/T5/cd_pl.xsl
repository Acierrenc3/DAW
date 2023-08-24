<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="utf-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="utf-8"/>
                <title>Lista CDs</title>
                <link href="cd_pl.css" rel="stylesheet" type="text/css"/>
            </head>
            <body>
                <h1 class="textoverde textocentro" >Listado de CDs de Música</h1>
                <table>
                    <thead>
                        <tr style = "background-color: white">
                            <th>Titulo</th><th>Año</th><th>Artistas</th><th>Canciones</th><th>Sellos</th>
                        </tr>
                    </thead>
                        <tbody>
                        <xsl:for-each select="cds/cd">
                            <tr>
                                <td><xsl:value-of select="@titulo_album"/></td>
                                <td><xsl:value-of select="@año_publicacion"/></td>
                                <td><xsl:value-of select="artista"/></td>
                                <xsl:if test="position() mod 2 = 1">
                                    <tr style = "background-color: darkgreen">
                                        <th>Duracion</th><th>Titulo</th>
                                    </tr>
                                    <xsl:for-each select ="cancion">
                                        <tr style = "background-color: lightgreen">
                                            <td><duracion><xsl:value-of select = "@duracion"/></duracion></td>
                                            <td><titulo><xsl:value-of select = "."/></titulo></td>
                                        </tr>
                                    </xsl:for-each>
                                </xsl:if>
                                <xsl:if test="position() mod 2 != 1">
                                    <tr style = "background-color: lightgreen">
                                        <th>Duracion</th><th>Titulo</th>
                                    </tr>
                                    <xsl:for-each select ="cancion">
                                        <tr style = "background-color: darkgreen">
                                            <td><duracion><xsl:value-of select = "@duracion"/></duracion></td>
                                            <td><titulo><xsl:value-of select = "."/></titulo></td>
                                        </tr>
                                    </xsl:for-each>
                                </xsl:if>
                                    <td>
                                        <xsl:for-each select ="sello_discografico">
                                        <ul><sello_discografico><xsl:value-of select = "."/></sello_discografico></ul>
                                        </xsl:for-each>
                                    </td>
                            </tr>
                        </xsl:for-each>
                    </tbody>
                    <tfooter>
                    </tfooter>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
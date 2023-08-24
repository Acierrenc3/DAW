<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compact" />
    <xsl:template match="/">
        <html>
            <head>
                <meta charset="UTF-8" />
                <meta http-equiv="X-UA-Compatible" content="IE=edge" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>Nirvana</title>
                <style>
                    * { margin: auto; margin-top: 20px; margin-bottom: 20px; }
                    li { list-style-type: none; }
                    .enunciado { text-align: center; text-decoration: underline; color: green; }
                    tr:nth-child(even) { background-color: lightgreen; text-align: left; }
                    tr:nth-child(odd) { background-color: darkgreen; text-align: left; }
                </style>
            </head>
            <body>
                <h1 class="enunciado">Canciones de Nirvana</h1>
                <table>
                    <tr style="background-color: white; text-align: center;">
                        <th>Duración</th><th>Título</th><th>Album</th>
                    </tr>
                    <xsl:for-each select="cds/cd[artista='Nirvana']">
                        <tr>
                            <td>
                                <xsl:for-each select ="canciones/cancion/@duracion">
                                    <li><xsl:value-of select = "." /></li>
                                </xsl:for-each>
                            </td>
                            <td>
                                <xsl:for-each select ="canciones/cancion">
                                    <li><xsl:value-of select = "." /></li>
                                </xsl:for-each>
                            </td>
                            <td><xsl:value-of select="@titulo_album" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/">
        <html>
            <head>Hispanos y Ciudades</head>
            <body>
                <h1>Paises hispanos con sus ciudades y población de estas.</h1>
                <table>
                    <tr bgcolor="lightblue">
                        <th>Nombre</th>
                        <th>Ciudades</th>
                        <th>Población</th>
                    </tr>
                    <xsl:for-each select="countries/country[language='Spanish']">
                        <xsl:sort select="@population" data-type="number" order="descending" />
                        <tr>
                            <td>
                                <xsl:value-of select="@name"/>
                            </td>
                            <td>
                                <xsl:value-of select="city/name"/>
                            </td>
                            <td>
                                <xsl:value-of select="city/population"/>
                            </td>
                                <xsl:for-each select="city[position() &gt; '1']">
                                    <tr>
                                        <td></td>
                                        <td>
                                            <xsl:value-of select="name" />
                                        </td>
                                        <td>
                                            <xsl:value-of select="population" />
                                        </td>
                                    </tr>
                                </xsl:for-each>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
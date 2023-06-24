<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:variable name="poblacion" select="sum(//country/@population)" />
    <xsl:template match="/">
            <html>
            <head>
                <title>Paises mas y menos poblados</title>
            </head>
            <body>
                <h1>Los 10 pasies con mayor población</h1>
                <table>
                    <tr bgcolor="lightblue">
                        <th>
                            Posición</th>
                        <th>Nombre</th>
                        <th>Poblacion</th>
                        <th>% respecto de la Tierra</th>
                    </tr>
                    <xsl:for-each select="countries/country">
                        <xsl:sort select="@population" data-type="number" order="descending" />
                        <xsl:if
                            test="position() &lt;= 10">
                            <tr>
                                <td>
                                    <xsl:value-of select="position()" />
                                </td>
                                <td>
                                    <xsl:value-of select="@name" />
                                </td>
                                <td>
                                    <xsl:value-of select="@population" />
                                </td>
                                <td>
                                    <xsl:value-of
                                        select="format-number((@population * 100) div $poblacion, '#.##')" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
                <h1>Los 10 pasies con menor población</h1>
                <table>
                    <tr bgcolor="lightblue">
                        <th>Posición</th>
                        <th>Nombre</th>
                        <th>Poblacion</th>
                        <th>% respecto de la Tierra</th>
                    </tr>
                    <xsl:for-each select="countries/country">
                        <xsl:sort select="@population" data-type="number" order="ascending" />
                        <xsl:if
                            test="position() &lt;= 10">
                            <tr>
                                <td>
                                    <xsl:value-of select="position()" />
                                </td>
                                <td>
                                    <xsl:value-of select="@name" />
                                </td>
                                <td>
                                    <xsl:value-of select="@population" />
                                </td>
                                <td>
                                    <xsl:value-of
                                        select="format-number((@population * 100) div $poblacion, '0.##########')" />
                                </td>
                            </tr>
                        </xsl:if>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
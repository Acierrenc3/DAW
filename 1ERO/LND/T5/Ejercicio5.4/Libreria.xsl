<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <title>Ejemplo xsl de uso de plantillas</title>
            </head>
            <body>
                <h1>Librería Gamma</h1>
                <xsl:apply-templates />
            </body>
        </html>
    </xsl:template>
    <xsl:template match="libreria">
        <h2>Lecturas Recomendadas</h2>
        <table>
            <tr style="background-color:#887788;">
                <th>Título</th><th>Autor</th>
            </tr>
            <xsl:apply-templates select="libro"/>
        </table>
    </xsl:template>
    <xsl:template match="libro">
        <tr>
            <xsl:apply-templates select="titulo" />
            <xsl:apply-templates select="autor" />
        </tr>
    </xsl:template>
    <xsl:template match="titulo">
        <td style="background-color: #DDEEDD;"><xsl:value-of select="." /></td>
    </xsl:template>
    <xsl:template match="autor">
        <td style="background-color: #AABBAA;"><xsl:value-of select="." /></td>
    </xsl:template>
</xsl:stylesheet>
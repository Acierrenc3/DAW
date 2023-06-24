<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="utf-8" indent="yes" method="html"
                doctype-system="about:legacy-compat" />
<xsl:template match="/">
        <html>
            <head>
                <title><xsl:value-of select="empresa/datos/nombre"></xsl:value-of></title>
                <meta charset="UTF-8"/>
            </head>
            <!--Informacion Empresa-->
            <body>
                <h1><xsl:value-of select="empresa/datos/nombre"/></h1>
                <img>
                    <xsl:attribute name="src">
                        <xsl:value-of select="empresa/datos/logo"></xsl:value-of>
                    </xsl:attribute>
                </img>
                <h2>CIF</h2>
                <p><xsl:value-of select="empresa/datos/cif"></xsl:value-of></p>
                <h2>Localidad</h2>
                <p><xsl:value-of select="empresa/datos/localidad"></xsl:value-of>(<xsl:value-of select="empresa/datos/provincia"/>)</p>
                <h2>Telefono</h2>
                <xsl:for-each select="empresa/datos/telefono">
                    <p><xsl:value-of select="."></xsl:value-of></p>
                </xsl:for-each>
                <xsl:if test="empresa/datos/fax">
                <h2>Fax</h2>
                <p><xsl:value-of select="empresa/datos/fax"></xsl:value-of></p>
                </xsl:if>
                <h2>Email</h2>
                <p><xsl:value-of select="empresa/datos/email"></xsl:value-of></p>
                <hr/>
                <!--Informacion de las Sedes-->
                <h1>Sedes de la empresa</h1>
                <xsl:apply-templates select="//sedes/sede"/>
                <hr/>
                <h2>Listado de Empleados por Categorías</h2>
                <xsl:for-each select="//categoria">
                    <h3><xsl:value-of select="nombre"/></h3>
                    <xsl:variable name="tipo"><xsl:value-of select="@tipo"/></xsl:variable>
            <ul>
                <li>
                    <xsl:value-of select="//empleado[categoria_nombre=$tipo]/nombre"/>
                </li>
                <li>empleado</li>
                <li>empleado</li>
                <li>empleado</li>
                <li>empleado</li>
            </ul>
                </xsl:for-each>
            </body>
        </html>
</xsl:template>
    <xsl:template match="sede">
        <h2><xsl:value-of select="datossede/localidad"/>-<xsl:value-of select="datossede/provincia"/>
        (<xsl:value-of select="@num"/>)</h2>
        <p><xsl:value-of select="datossede/direccion"/>&#160;CP:&#160;
        <xsl:value-of select="datossede/cp"/>&#160; Tfno: &#160;<xsl:value-of select="datossede/telefono"/></p>
        <xsl:variable name="resp"><xsl:value-of select="responsable"/></xsl:variable>
        <table border="1" width="80%">
            <tr>
                <th>Responsable</th>
            </tr>
                <td><xsl:value-of select="//empleados/empleado[@cod=$resp]/nombre"/>&#160; 
                    <xsl:value-of select="//empleados/empleado[@cod=$resp]/apellido1"/>&#160; 
                    <xsl:value-of select="//empleados/empleado[@cod=$resp]/apellido2"/></td>
            <tr>
                <th>Trabajadores</th>
            </tr>
                <xsl:for-each select="trabajador">
                    <xsl:variable name="empl"><xsl:value-of select="."/></xsl:variable>
                <xsl:apply-templates select="//empleados/empleado[@cod=$empl]"/>
                </xsl:for-each>
        </table>    
    </xsl:template>
    <xsl:template match="empleado">
        <tr>
            <td><xsl:value-of select="nombre"/>&#160;<xsl:value-of select="apellido1"/>&#160;<xsl:value-of select="apellido2"/>
            </td>
        </tr>
    </xsl:template>
</xsl:stylesheet>
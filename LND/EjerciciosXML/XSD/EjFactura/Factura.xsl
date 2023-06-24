<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/"> <!--Cuidado con el Indent, si está en "No" el saxon no pilla los espacios-->
        <html>
            <head>
                <title>FACTURA</title>
                <style>
                    *{text-align:center; margin:auto; margin-top: 20px; margin-bottom: 1px; }
                    table, h1 {margin:0;}
                    th {background-color: lightblue; color: blue;}
                    tr:nth-child(even) {background-color: gray;}
                    tr:nth-child(odd) {background-color: lightgray;}
                    td {text-align: left;}
                    th {border: 1px solid black;}
                    .derecha {text-align: right;}
                </style>
            </head>
                <body>
                    <table style="background-color:white" border="1" cellspacing="0" cellpadding="2">
                        <tr>
                            <th colspan="6">FACTURA Nº199</th>
                        </tr>
                            <xsl:for-each select="//factura">
                                <td colspan="4">
                                    <xsl:value-of select="empresa"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="direccion"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="cif"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="telefono"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="fax"></xsl:value-of>
                                </td>
                            </xsl:for-each>
                            <xsl:for-each select="//pedido">
                                <td colspan="2">
                                    <xsl:value-of select="fecha"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="npedido"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="formaDePago"></xsl:value-of>
                                    <br/>
                                </td>
                            </xsl:for-each>
                            <tr>
                            <th colspan="6">Datos CLIENTE</th>
                            </tr>
                            <xsl:for-each select="//clientes">
                                <td colspan="6" >
                                    <xsl:value-of select="ncliente"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="nombre"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="direccionenvio"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="poblacion"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="cod.postal"></xsl:value-of>
                                    <br/>
                                    <xsl:value-of select="provincia"></xsl:value-of>
                                </td>
                        </xsl:for-each>
                        <tr>
                        <th colspan="6">Datos FACTURA</th>
                        </tr>
                        <th>REF.</th><th>DESCRIPCION</th><th>CANT.</th><th>PRECIO</th><th>I.V.A</th><th>IMPORTE</th>
                        <tr>
                            <xsl:for-each select="/facturas/pedido/productos/producto">
                                    <td><xsl:value-of select="referencia"></xsl:value-of></td>
                                    <td><xsl:value-of select="descripcion"></xsl:value-of></td>
                                    <td><xsl:value-of select="cantidad"></xsl:value-of></td>
                                    <td><xsl:value-of select="precio"></xsl:value-of></td>
                                    <td><xsl:value-of select="iva"></xsl:value-of></td>
                                    <td><xsl:value-of select="importe"></xsl:value-of></td>
                            </xsl:for-each>
                        </tr>
                        <tr>
                            <th colspan="2">Base Imponible</th><th colspan="2">% I.V.A.</th><th  colspan="2">Cuota I.V.A.</th>
                        </tr>
                            <th colspan="6">Total Factura</th>
                        <tr>
                            <xsl:for-each select="/facturas/pedido/productos">
                                <td style="text-align:center" colspan="6"><xsl:value-of select="totalfactura"></xsl:value-of></td>
                            </xsl:for-each>
                        </tr>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
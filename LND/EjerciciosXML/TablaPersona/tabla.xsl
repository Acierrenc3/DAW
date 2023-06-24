<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output encoding="UTF-8" indent="yes" method="html" doctype-system="about:legacy-compat" />
    <xsl:template match="/"> 
        <html>
            <head>
                <title>BALANCE</title>
                <style>
                    *{text-align:center; margin:auto; margin-top: 20px; margin-bottom: 1px;}
                    table {margin 0;}
                    th {background-color: lightblue; color: blue;}
                    tr:nth-child(even) {background-color: gray;}
                    tr:nth-child(odd) {background-color: lightgray;}
                    td {text-align: left;}
                    th {border: 1px solid black;}
                </style>
            </head>
                <body>
                    <table style="background-color:white" border="1" cellspacing="0" cellpadding="2">
                        <thead>
                            <tr>
                                <th colspan="1"></th><th colspan="2">Anthony</th><th colspan="2">Lionel</th>
                            </tr>
                            <tr>
                                <th>Fecha</th><th>Income</th><th>Outcome</th><th>Income</th><th>Outcome</th>
                            </tr>
                        </thead>
                            <xsl:for-each select="personas/fechas/fecha">
                            <tr>
                                <td><xsl:value-of select="."/></td>
                                <!--<td><xsl:value-of select="../../persona[@nombre='Anthony']/incomes/income[4]"/></td>-->
                            </tr>
                            </xsl:for-each>
                            <xsl:for-each select="personas/persona[@nombre='Anthony']/incomes/income">
                            <tr>
                                <td><xsl:value-of select="."/></td>
                            </tr>
                            </xsl:for-each>
                    </table>
                </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
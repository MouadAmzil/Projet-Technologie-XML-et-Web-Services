<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    xmlns:xs="http://www.w3.org/2001/XMLSchema"
    exclude-result-prefixes="xs"
    version="2.0">
    <xsl:template match="/">
        <html>
            <head>
                <title>Releve</title>
            </head>
            <body>
                <xsl:for-each select="/releve">
                    <ul>
                        <li>RIB : <xsl:value-of select="@rib"></xsl:value-of></li>
                        <li>Date de Releve : <xsl:value-of select="datereleve"></xsl:value-of></li>
                        <li>Solde : <xsl:value-of select="solde"></xsl:value-of></li>
                    </ul>
                    <xsl:for-each select="/releve/operations">
                        <ul>
                            <li>Operations :</li>
                            <ul>
                                <li>Date De Debut => <xsl:value-of select="@datedebut"></xsl:value-of></li>
                                <li>Date de fin =>  <xsl:value-of select="@datefin"></xsl:value-of></li>         
                            </ul>
                        </ul>
                        <table border="1" width="90%">
                            <tr>
                                <th>Type</th><th>Date</th><th>Montant</th><th>Description</th>
                            </tr>
                            <xsl:for-each select="operation">
                                <tr>
                                    <td><xsl:value-of select="@type"></xsl:value-of></td>
                                    <td><xsl:value-of select="@date"></xsl:value-of></td>
                                    <td><xsl:value-of select="@montant"></xsl:value-of></td>
                                    <td><xsl:value-of select="@description"></xsl:value-of></td>
                                </tr>
                            </xsl:for-each>

                        </table>
                    </xsl:for-each>
                    <ul>
                        <li>Total des Opérations de Débit : <xsl:value-of select="count(/releve/operations/operation [@type='DEBIT'] )"></xsl:value-of></li>
                        <li>Total des Opérations de Crédit : <xsl:value-of select="count(/releve/operations/operation [@type='CREDIT'] )"></xsl:value-of></li>
                    </ul>
                    <xsl:for-each select="/releve/operations">
                        <ul>
                            <li>Les Opérations de Type CREDIT d’un Relevé Bancaire : </li>
                            <table border="1" width="90%">
                                <tr>
                                    <th>Type</th><th>Date</th><th>Montant</th><th>Description</th>
                                </tr>
                                <xsl:for-each select="operation [@type='CREDIT']">
                                    <tr>
                                        <td><xsl:value-of select="@type"></xsl:value-of></td>
                                        <td><xsl:value-of select="@date"></xsl:value-of></td>
                                        <td><xsl:value-of select="@montant"></xsl:value-of></td>
                                        <td><xsl:value-of select="@description"></xsl:value-of></td>
                                    </tr>

                                </xsl:for-each>
                                <tr>
                                    <th colspan="2">Les Opérations de Type CREDIT</th>
                                    <th><xsl:value-of select="sum(operation [@type='CREDIT']/@montant)"></xsl:value-of></th>
                                </tr>
                            </table>
                        </ul>
                    </xsl:for-each>
                </xsl:for-each>             
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
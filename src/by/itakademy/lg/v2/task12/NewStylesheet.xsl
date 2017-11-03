<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" />
	<xsl:template match="/pointslist">
		<table border="1">
			<xsl:apply-templates />
		</table>
	</xsl:template>
	<xsl:template match="/pointslist/point">
		<tr>
			<xsl:apply-templates />
		</tr>
	</xsl:template>
	<xsl:template match="/pointslist/point/x">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/pointslist/point/y">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
	<xsl:template match="/pointslist/point/unit">
		<td>
			<xsl:value-of select="text()" />
		</td>
	</xsl:template>
</xsl:stylesheet>
package org.task

data class CellAttributes(
    val foregroundColor: TerminalColor? = null,
    val backgroudColor: TerminalColor? = null,
    val styles: Set<Style> = emptySet()
)
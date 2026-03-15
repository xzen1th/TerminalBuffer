package org.task

/*
* Add cell kind - Empty or Normal
* */

enum class CellKind { Empty, Normal }

data class TerminalCell(
    var text: String? = null,
    var attributes: CellAttributes = CellAttributes()
)
{
    fun displayText(): String {
        return when (kind){
            CellKind.Empty -> " "
            CellKind.Normal -> text ?: ""
        }
    }

    fun copyOf() : TerminalCell = copy()
}


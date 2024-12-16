package br.com.brunodorea.tetris.model

import androidx.compose.ui.graphics.Color
import br.com.brunodorea.tetris.ui.theme.GREEN
data class PecaTetris(
    val tipo: TipoDePeca,
    val x: Int,
    val y: Int,
    val indexRotacao: Int = 0
)

enum class TipoDePeca(
    val shapes: Array<Array<IntArray>>,
    val color: Color
){
    I(arrayOf(
        arrayOf(intArrayOf(1, 1, 1, 1)),
        arrayOf(intArrayOf(1), intArrayOf(1), intArrayOf(1), intArrayOf(1))
    ), GREEN),

    J(arrayOf(
        arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1)),
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 0)),
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 1),
            intArrayOf(1, 1))
    ), GREEN),

    L(arrayOf(
        arrayOf(
            intArrayOf(0, 0, 1),
            intArrayOf(1, 1, 1)),
        arrayOf(
            intArrayOf(1, 1),
            intArrayOf(0, 1),
            intArrayOf(0, 1)),
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 0, 0)),
        arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 0),
            intArrayOf(1, 1))
    ), GREEN),

    O(arrayOf(
        arrayOf(intArrayOf(1, 1), intArrayOf(1, 1))
    ), GREEN),

    S(arrayOf(
        arrayOf(
            intArrayOf(0, 1, 1),
            intArrayOf(1, 1, 0)),
        arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 1),
            intArrayOf(0, 1))
    ), GREEN),

    T(arrayOf(
        arrayOf(
            intArrayOf(0, 1, 0),
            intArrayOf(1, 1, 1)),
        arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 1),
            intArrayOf(1, 0)),
        arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(0, 1, 0)),
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 1),
            intArrayOf(0, 1))
    ), GREEN),

    Z(arrayOf(
        arrayOf(
            intArrayOf(1, 1, 0),
            intArrayOf(0, 1, 1)),
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 1),
            intArrayOf(1, 0))
    ), GREEN)

}
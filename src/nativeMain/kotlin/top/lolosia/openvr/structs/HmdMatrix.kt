package top.lolosia.openvr.structs

import kotlinx.cinterop.*

@OptIn(ExperimentalForeignApi::class)
interface HmdMatrix : Iterable<Float> {
    val m: CArrayPointer<FloatVarOf<Float>>
    val length: Int

    operator fun get(i: Int): Float = m[i]
    operator fun set(i: Int, value: Float) {
        m[i] = value
    }

    override operator fun iterator() = object : Iterator<Float> {
        var i = -1;
        override fun hasNext() = i < length

        override fun next(): Float {
            i++
            return m[i]
        }
    }
}
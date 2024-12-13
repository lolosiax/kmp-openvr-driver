package top.lolosia.openvr.structs

import kotlinx.cinterop.*

@OptIn(ExperimentalForeignApi::class)
interface HmdMatrix : HmdIterable<Float> {
    val m: CArrayPointer<FloatVar>

    override operator fun get(index: Int): Float = m[index]
    operator fun set(i: Int, value: Float) {
        m[i] = value
    }
}
package top.lolosia.openvr.structs

import kotlinx.cinterop.*
import top.lolosia.openvr.capi.HmdMatrix34_t
import kotlin.math.max
import kotlin.math.sqrt

@OptIn(ExperimentalForeignApi::class)
value class HmdMatrix34(val value: HmdMatrix34_t) : HmdMatrix {
    override val m get() = value.m //float[3][4]
    override val length get() = 12

    val position get() = Triple(m[3], m[7], -m[11])

    val rotationValid: Boolean
        get() {
            return ((m[2] != 0f || m[6] != 0f || m[10] != 0f) && (m[1] != 0f || m[5] != 0f || m[9] != 0f))
        }

    val rotation : Array<Float>
        get() {
            val w: Float = sqrt(max(0f, 1 + m[0] + m[5] + m[10])) / 2
            var x: Float = sqrt(max(0f, 1 + m[0] - m[5] - m[10])) / 2
            var y: Float = sqrt(max(0f, 1 - m[0] + m[5] - m[10])) / 2
            var z: Float = sqrt(max(0f, 1 - m[0] - m[5] + m[10])) / 2
            x = x.copySign(-m[9] - -m[6])
            y = y.copySign(-m[2] - -m[8])
            z = z.copySign(m[4] - m[1])
            return arrayOf(x, y, z, w)
        }
}

private fun Float.copySign(sign: Float): Float {
    return if (sign > 0 != this > 0) -this
    else this
}
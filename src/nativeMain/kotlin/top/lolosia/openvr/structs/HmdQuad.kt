package top.lolosia.openvr.structs

import kotlinx.cinterop.*
import platform.posix.memcpy
import top.lolosia.openvr.capi.HmdQuad_t
import top.lolosia.openvr.capi.HmdVector3_t

@OptIn(ExperimentalForeignApi::class)
value class HmdQuad(val value: HmdQuad_t) : HmdIterable<HmdVector3> {
    override val length get() = 4
    override operator fun get(index: Int): HmdVector3 {
        return HmdVector3(value.vCorners[index])
    }

    operator fun set(index: Int, v: HmdVector3) {
        memScoped {
            val ptr = value.vCorners.rawValue + index * sizeOf<HmdVector3_t>()
            val p1 = ptr.toLong().toCPointer<HmdVector3_t>()

            memcpy(p1, v.value.ptr, sizeOf<HmdVector3_t>().toULong())
        }
    }
}
package top.lolosia.openvr.structs

import kotlinx.cinterop.*
import top.lolosia.openvr.capi.HmdQuad_t

@OptIn(ExperimentalForeignApi::class)
value class HmdQuad(val value: HmdQuad_t) {
    operator fun get(index: Int): HmdVector3 {
        return HmdVector3(value.vCorners[index])
    }

    // TODO need set() function.
}
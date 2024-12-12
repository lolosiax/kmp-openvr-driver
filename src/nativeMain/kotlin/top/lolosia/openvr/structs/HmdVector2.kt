package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.get
import kotlinx.cinterop.set
import top.lolosia.openvr.capi.HmdVector2_t
import top.lolosia.openvr.capi.HmdVector3_t

@OptIn(ExperimentalForeignApi::class)
value class HmdVector2(val value: HmdVector2_t) {
    var x
        get() = value.v[0]
        set(v) = value.v.set(0, v)

    var y
        get() = value.v[1]
        set(v) = value.v.set(1, v)
}
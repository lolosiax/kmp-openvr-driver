package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.get
import kotlinx.cinterop.set
import top.lolosia.openvr.capi.HmdVector3_t
import top.lolosia.openvr.capi.HmdVector4_t

@OptIn(ExperimentalForeignApi::class)
value class HmdVector4(val value: HmdVector4_t) {
    var x
        get() = value.v[0]
        set(v) = value.v.set(0, v)

    var y
        get() = value.v[1]
        set(v) = value.v.set(1, v)

    var z
        get() = value.v[2]
        set(v) = value.v.set(2, v)

    var w
        get() = value.v[3]
        set(v) = value.v.set(3, v)
}
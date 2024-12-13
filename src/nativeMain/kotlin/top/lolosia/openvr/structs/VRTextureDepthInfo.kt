package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRTextureDepthInfo_t

@OptIn(ExperimentalForeignApi::class)
value class VRTextureDepthInfo(val value: VRTextureDepthInfo_t) {

    var handle
        get() = value.handle
        set(value) {
            this.value.handle = value
        }

    val mProjection get() = HmdMatrix44(value.mProjection)
    val vRange get() = HmdVector2(value.vRange)
}
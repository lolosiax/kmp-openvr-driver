package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRTextureWithPose_t
import top.lolosia.openvr.enums.ColorSpace
import top.lolosia.openvr.enums.TextureType

@OptIn(ExperimentalForeignApi::class)
value class VRTextureWithPose(val value: VRTextureWithPose_t) {

    var handle
        get() = value.handle
        set(value) {
            this.value.handle = value
        }

    var eType
        get() = TextureType.valueOf(value.eType)
        set(value) {
            this.value.eType = value.value
        }

    var eColorSpace
        get() = ColorSpace.valueOf(value.eColorSpace)
        set(value) {
            this.value.eColorSpace = value.value
        }

    val mDeviceToAbsoluteTracking
        get() = HmdMatrix34(value.mDeviceToAbsoluteTracking)
}
package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRTextureWithDepth_t
import top.lolosia.openvr.enums.ColorSpace
import top.lolosia.openvr.enums.TextureType

@OptIn(ExperimentalForeignApi::class)
value class VRTextureWithDepth(val value: VRTextureWithDepth_t) {

    var handle
        get() = value.handle
        set(value) {
            this.value.handle = value
        }

    var type
        get() = TextureType.valueOf(value.eType)
        set(value) {
            this.value.eType = value.value
        }

    var colorSpace
        get() = ColorSpace.valueOf(value.eColorSpace)
        set(value) {
            this.value.eColorSpace = value.value
        }

    val depth get() = VRTextureDepthInfo(value.depth)
}
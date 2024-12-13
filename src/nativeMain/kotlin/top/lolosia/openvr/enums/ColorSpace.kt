package top.lolosia.openvr.enums

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.EColorSpace_ColorSpace_Auto
import top.lolosia.openvr.capi.EColorSpace_ColorSpace_Gamma
import top.lolosia.openvr.capi.EColorSpace_ColorSpace_Linear

@OptIn(ExperimentalForeignApi::class)
enum class ColorSpace(val value: UInt) {
    Auto(EColorSpace_ColorSpace_Auto),
    Gamma(EColorSpace_ColorSpace_Gamma),
    Linear(EColorSpace_ColorSpace_Linear);

    companion object {
        private val map = entries.associateBy(ColorSpace::value)
        fun valueOf(value: UInt) = map[value]!!
    }
}
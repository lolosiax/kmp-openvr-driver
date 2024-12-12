package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdMatrix33_t

@OptIn(ExperimentalForeignApi::class)
value class HmdMatrix33(val value: HmdMatrix33_t) : HmdMatrix {
    override val m get() = value.m //float[3][3]
    override val length get() = 9
}
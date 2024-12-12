package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdMatrix44_t

@OptIn(ExperimentalForeignApi::class)
value class HmdMatrix44(val value: HmdMatrix44_t) : HmdMatrix {
    override val m get() = value.m //float[4][4]
    override val length get() = 16
}
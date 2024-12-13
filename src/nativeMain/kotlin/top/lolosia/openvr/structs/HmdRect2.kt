package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdRect2_t

@OptIn(ExperimentalForeignApi::class)
value class HmdRect2(val value: HmdRect2_t) {
    val vBottomRight get() = HmdVector2(value.vBottomRight)
    val vTopLeft get() = HmdVector2(value.vTopLeft)
}
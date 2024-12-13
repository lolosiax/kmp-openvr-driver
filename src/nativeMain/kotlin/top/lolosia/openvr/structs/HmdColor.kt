package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdColor_t

@OptIn(ExperimentalForeignApi::class)
typealias HmdColor = HmdColor_t

@OptIn(ExperimentalForeignApi::class)
inline fun HmdColor(value: HmdColor_t): HmdColor = value
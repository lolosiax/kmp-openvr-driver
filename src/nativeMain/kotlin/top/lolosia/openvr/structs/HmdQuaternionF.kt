package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdQuaternionf_t

@OptIn(ExperimentalForeignApi::class)
typealias HmdQuaternionF = HmdQuaternionf_t

@OptIn(ExperimentalForeignApi::class)
inline fun HmdQuaternionF(value: HmdQuaternionf_t): HmdQuaternionF = value
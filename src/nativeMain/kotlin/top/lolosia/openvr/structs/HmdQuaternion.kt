
package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.HmdQuaternion_t

@OptIn(ExperimentalForeignApi::class)
typealias HmdQuaternion = HmdQuaternion_t

@OptIn(ExperimentalForeignApi::class)
inline fun HmdQuaternion(value: HmdQuaternion_t): HmdQuaternion = value
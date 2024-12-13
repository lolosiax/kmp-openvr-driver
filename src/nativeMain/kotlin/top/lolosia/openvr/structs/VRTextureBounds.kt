
package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRTextureBounds_t

@OptIn(ExperimentalForeignApi::class)
typealias VRTextureBounds = VRTextureBounds_t

@OptIn(ExperimentalForeignApi::class)
inline fun VRTextureBounds(value: VRTextureBounds_t): VRTextureBounds = value
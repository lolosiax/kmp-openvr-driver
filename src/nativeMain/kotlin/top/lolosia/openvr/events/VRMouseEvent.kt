package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Mouse_t

@OptIn(ExperimentalForeignApi::class)
typealias VRMouseEvent = VREvent_Mouse_t
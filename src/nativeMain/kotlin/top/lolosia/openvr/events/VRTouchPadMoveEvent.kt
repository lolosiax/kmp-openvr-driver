package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_TouchPadMove_t

@OptIn(ExperimentalForeignApi::class)
typealias VRTouchPadMoveEvent = VREvent_TouchPadMove_t
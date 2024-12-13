package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Scroll_t

@OptIn(ExperimentalForeignApi::class)
typealias VRScrollEvent = VREvent_Scroll_t
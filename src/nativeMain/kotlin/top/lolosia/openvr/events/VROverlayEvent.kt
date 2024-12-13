package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Overlay_t

@OptIn(ExperimentalForeignApi::class)
typealias VROverlayEvent = VREvent_Overlay_t
package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Chaperone_t

@OptIn(ExperimentalForeignApi::class)
typealias VRChaperoneEvent = VREvent_Chaperone_t
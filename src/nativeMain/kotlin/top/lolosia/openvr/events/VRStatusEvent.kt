package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Status_t

@OptIn(ExperimentalForeignApi::class)
typealias VRStatusEvent = VREvent_Status_t
package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Process_t

@OptIn(ExperimentalForeignApi::class)
typealias VRProcessEvent = VREvent_Process_t
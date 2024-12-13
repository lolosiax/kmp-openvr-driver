package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Controller_t

@OptIn(ExperimentalForeignApi::class)
typealias VRControllerEvent = VREvent_Controller_t
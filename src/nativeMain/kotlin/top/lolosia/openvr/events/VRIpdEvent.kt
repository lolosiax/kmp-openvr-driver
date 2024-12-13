package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Ipd_t

@OptIn(ExperimentalForeignApi::class)
typealias VRIpdEvent = VREvent_Ipd_t
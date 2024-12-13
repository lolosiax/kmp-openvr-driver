package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_PerformanceTest_t

@OptIn(ExperimentalForeignApi::class)
typealias VRPerformanceTestEvent = VREvent_PerformanceTest_t
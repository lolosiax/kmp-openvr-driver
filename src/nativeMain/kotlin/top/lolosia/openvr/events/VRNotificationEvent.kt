package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Notification_t

@OptIn(ExperimentalForeignApi::class)
typealias VRNotificationEvent = VREvent_Notification_t
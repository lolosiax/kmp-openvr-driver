package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.TrackedDevicePose_t
import top.lolosia.openvr.enums.TrackingResult

@OptIn(ExperimentalForeignApi::class)
value class TrackedDevicePose(val value: TrackedDevicePose_t) {

    val deviceToAbsoluteTracking
        get() = HmdMatrix34(value.mDeviceToAbsoluteTracking)

    val velocity get() = HmdVector3(value.vVelocity)
    val angularVelocity get() = HmdVector3(value.vAngularVelocity)
    var trackingResult
        get() = TrackingResult.valueOf(value.eTrackingResult)
        set(value) {
            this.value.eTrackingResult = value.value
        }

    var poseIsValid: Boolean
        get() = value.bPoseIsValid > 0
        set(value) {
            this.value.bPoseIsValid = if (value) 1 else 0
        }

    var deviceIsConnected: Boolean
        get() = value.bDeviceIsConnected > 0
        set(value) {
            this.value.bDeviceIsConnected = if (value) 1 else 0
        }
}
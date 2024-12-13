package top.lolosia.openvr.enums

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.*

@OptIn(ExperimentalForeignApi::class)
enum class TrackingResult(val value: UInt) {
    Calibrating_InProgress(ETrackingResult_TrackingResult_Calibrating_InProgress),
    Calibrating_OutOfRange(ETrackingResult_TrackingResult_Calibrating_OutOfRange),
    Fallback_RotationOnly(ETrackingResult_TrackingResult_Fallback_RotationOnly),
    Running_OK(ETrackingResult_TrackingResult_Running_OK),
    Running_OutOfRange(ETrackingResult_TrackingResult_Running_OutOfRange),
    Uninitialized(ETrackingResult_TrackingResult_Uninitialized);

    companion object {
        private val map = entries.associateBy(TrackingResult::value)
        fun valueOf(value: UInt) = map[value]!!
    }
}
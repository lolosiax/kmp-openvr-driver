package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_SeatedZeroPoseReset_t

@OptIn(ExperimentalForeignApi::class)
value class VRSeatedZeroPoseResetEvent(val value: VREvent_SeatedZeroPoseReset_t) {
    var resetBySystemMenu: Boolean
        get() = value.bResetBySystemMenu > 0
        set(value) {
            this.value.bResetBySystemMenu = if (value) 1 else 0
        }
}
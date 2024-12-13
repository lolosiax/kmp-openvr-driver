package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.readBytes
import kotlinx.cinterop.toKString
import top.lolosia.openvr.capi.VREvent_Keyboard_t

@OptIn(ExperimentalForeignApi::class)
value class VRKeyboardEvent(val value: VREvent_Keyboard_t) {

    val newInput get() = value.cNewInput.readBytes(8).toKString()

    var queueFamilyIndex: ULong
        get() = value.uUserValue
        set(value) {
            this.value.uUserValue = value
        }

    var overlayHandle: ULong
        get() = value.overlayHandle
        set(value) {
            this.value.overlayHandle = value
        }
}
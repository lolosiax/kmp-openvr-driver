package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.get
import kotlinx.cinterop.set
import top.lolosia.openvr.capi.DistortionCoordinates_t

@OptIn(ExperimentalForeignApi::class)
value class DistortionCoordinates(val value: DistortionCoordinates_t) {
    var rfRed0
        get() = value.rfRed[0]
        set(value) {
            this.value.rfRed[0] = value
        }
    var rfRed1
        get() = value.rfRed[1]
        set(value) {
            this.value.rfRed[1] = value
        }
    var rfGreen0
        get() = value.rfGreen[0]
        set(value) {
            this.value.rfGreen[0] = value
        }
    var rfGreen1
        get() = value.rfGreen[1]
        set(value) {
            this.value.rfGreen[1] = value
        }
    var rfBlue0
        get() = value.rfBlue[0]
        set(value) {
            this.value.rfBlue[0] = value
        }
    var rfBlue1
        get() = value.rfBlue[1]
        set(value) {
            this.value.rfBlue[1] = value
        }
}
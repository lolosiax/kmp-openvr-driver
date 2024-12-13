package top.lolosia.openvr.events

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VREvent_Reserved_t
import top.lolosia.openvr.structs.HmdIterable

@OptIn(ExperimentalForeignApi::class)
value class VRReservedEvent(val value: VREvent_Reserved_t) : HmdIterable<ULong> {
    override val length get() = 6

    override fun get(index: Int): ULong = when (index) {
        0 -> value.reserved0
        1 -> value.reserved1
        2 -> value.reserved2
        3 -> value.reserved3
        4 -> value.reserved4
        5 -> value.reserved5
        else -> 0UL
    }

    operator fun set(index: Int, value: ULong) {
        when (index) {
            0 -> this.value.reserved0 = value
            1 -> this.value.reserved1 = value
            2 -> this.value.reserved2 = value
            3 -> this.value.reserved3 = value
            4 -> this.value.reserved4 = value
            5 -> this.value.reserved5 = value
        }
    }
}
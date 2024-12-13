package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRVulkanTextureArrayData_t

@OptIn(ExperimentalForeignApi::class)
value class VRVulkanTextureArrayData(val value: VRVulkanTextureArrayData_t) {
    var arrayIndex: UInt
        get() = value.m_unArrayIndex
        set(value) {
            this.value.m_unArrayIndex = value
        }

    var arraySize: UInt
        get() = value.m_unArraySize
        set(value) {
            this.value.m_unArraySize = value
        }
}
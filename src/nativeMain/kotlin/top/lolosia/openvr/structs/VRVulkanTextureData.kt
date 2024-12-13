package top.lolosia.openvr.structs

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import top.lolosia.openvr.capi.VRVulkanTextureData_t

@OptIn(ExperimentalForeignApi::class)
value class VRVulkanTextureData(val value: VRVulkanTextureData_t) {
    var image: ULong
        get() = value.m_nImage
        set(value) {
            this.value.m_nImage = value
        }

    @Suppress("UNCHECKED_CAST")
    var device
        get() = (value.m_pDevice as? CPointer<VkDevice>)?.pointed
        set(value) {
            this.value.m_pDevice = value!!.ptr as CPointer<cnames.structs.VkDevice_T>
        }

    @Suppress("UNCHECKED_CAST")
    var physicalDevice
        get() = (value.m_pPhysicalDevice as? CPointer<VkPhysicalDevice>)?.pointed
        set(value) {
            this.value.m_pPhysicalDevice = value?.ptr as? CPointer<cnames.structs.VkPhysicalDevice_T>
        }

    @Suppress("UNCHECKED_CAST")
    var instance
        get() = (value.m_pInstance as? CPointer<VkInstance>)?.pointed
        set(value) {
            this.value.m_pInstance = value?.ptr as? CPointer<cnames.structs.VkInstance_T>
        }

    @Suppress("UNCHECKED_CAST")
    var queue
        get() = (value.m_pQueue as? CPointer<VkQueue>)?.pointed
        set(value) {
            this.value.m_pQueue = value?.ptr as? CPointer<cnames.structs.VkQueue_T>
        }

    var queueFamilyIndex: UInt
        get() = value.m_nQueueFamilyIndex
        set(value) {
            this.value.m_nQueueFamilyIndex = value
        }

    var width: UInt
        get() = value.m_nWidth
        set(value) {
            this.value.m_nWidth = value
        }

    var height: UInt
        get() = value.m_nHeight
        set(value) {
            this.value.m_nHeight = value
        }

    var format: UInt
        get() = value.m_nFormat
        set(value) {
            this.value.m_nFormat = value
        }

    var sampleCount: UInt
        get() = value.m_nSampleCount
        set(value) {
            this.value.m_nSampleCount = value
        }
}
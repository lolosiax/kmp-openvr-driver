package top.lolosia.openvr.structs

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import top.lolosia.openvr.capi.D3D12TextureData_t

@OptIn(ExperimentalForeignApi::class)
value class D3D12TextureData(val value: D3D12TextureData_t) {

    var nodeMask: UInt
        get() = value.m_nNodeMask
        set(value) {
            this.value.m_nNodeMask = value
        }

    @Suppress("UNCHECKED_CAST")
    var commandQueue
        get() = (value.m_pCommandQueue as? CPointer<ID3D12CommandQueue>)?.pointed
        set(value) {
            this.value.m_pCommandQueue = value?.ptr as? CPointer<cnames.structs.ID3D12CommandQueue>
        }

    @Suppress("UNCHECKED_CAST")
    var resource
        get() = (value.m_pResource as? CPointer<ID3D12Resource>)?.pointed
        set(value) {
            this.value.m_pResource = value?.ptr as? CPointer<cnames.structs.ID3D12Resource>
        }
}
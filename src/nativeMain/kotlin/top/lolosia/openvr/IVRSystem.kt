@file:OptIn(ExperimentalForeignApi::class)
@file:Suppress("UNCHECKED_CAST")

package top.lolosia.openvr

import kotlinx.cinterop.*
import top.lolosia.openvr.capi.VR_IVRSystem_FnTable

private typealias GetRuntimeVersionFunc = () -> CPointer<ByteVar>
private typealias IsDisplayOnDesktopFunc = () -> Boolean
private typealias SetDisplayVisibility = (Boolean) -> Boolean
private typealias GetD3D9AdapterIndex = () -> Int

class IVRSystem {

    lateinit var capi: VR_IVRSystem_FnTable

    val runtimeVersion: String
        get() {
            val fn = capi.GetRuntimeVersion!! as CPointer<CFunction<GetRuntimeVersionFunc>>
            return fn().toKString()
        }

    var isDisplayOnDesktop: Boolean
        get() {
            val fn = capi.IsDisplayOnDesktop!! as CPointer<CFunction<IsDisplayOnDesktopFunc>>
            return fn()
        }
        set(value) {
            val fn = capi.SetDisplayVisibility!! as CPointer<CFunction<SetDisplayVisibility>>
            fn(value)
        }

    val d3D9AdapterIndex: Int get() {
        val fn = capi.GetD3D9AdapterIndex!! as CPointer<CFunction<GetD3D9AdapterIndex>>
        return fn()
    }
}
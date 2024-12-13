package top.lolosia.openvr.structs

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.VRBoneTransform_t

@OptIn(ExperimentalForeignApi::class)
value class VRBoneTransform(val value: VRBoneTransform_t) {
    val position get() = HmdVector4(value.position)
    val orientation : HmdQuaternionF get() = HmdQuaternionF(value.orientation)
}
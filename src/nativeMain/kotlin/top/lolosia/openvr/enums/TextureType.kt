package top.lolosia.openvr.enums

import kotlinx.cinterop.ExperimentalForeignApi
import top.lolosia.openvr.capi.*

@OptIn(ExperimentalForeignApi::class)
enum class TextureType(val value: Int) {
    DXGISharedHandle(ETextureType_TextureType_DXGISharedHandle),
    DirectX(ETextureType_TextureType_DirectX),
    DirectX12(ETextureType_TextureType_DirectX12),
    IOSurface(ETextureType_TextureType_IOSurface),
    Invalid(ETextureType_TextureType_Invalid),
    Metal(ETextureType_TextureType_Metal),
    OpenGL(ETextureType_TextureType_OpenGL),
    Reserved(ETextureType_TextureType_Reserved),
    Vulkan(ETextureType_TextureType_Vulkan);

    companion object {
        private val map = entries.associateBy(TextureType::value)
        fun valueOf(value: Int) = map[value]!!
    }
}
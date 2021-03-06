package vr;

import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.FloatByReference;
import com.sun.jna.ptr.IntByReference;
import com.sun.jna.ptr.PointerByReference;
import java.util.Arrays;
import java.util.List;

/**
 * This file was autogenerated by
 * <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that
 * <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a
 * few opensource projects.</a>.<br>
 * For help, please visit
 * <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> ,
 * <a href="http://rococoa.dev.java.net/">Rococoa</a>, or
 * <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IVRTrackedCamera_FnTable extends Structure {

    /*
      char * (OPENVR_FNTABLE_CALLTYPE *GetCameraErrorNameFromEnum)(EVRTrackedCameraError eCameraError);
     */
    public IVRTrackedCamera_FnTable.GetCameraErrorNameFromEnum_callback GetCameraErrorNameFromEnum;
    /*
      EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *HasCamera)(TrackedDeviceIndex_t nDeviceIndex, bool * pHasCamera);
     */
    public IVRTrackedCamera_FnTable.HasCamera_callback HasCamera;

    /*
      EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetCameraFrameSize)(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, uint32_t * pnWidth, uint32_t * pnHeight, uint32_t * pnFrameBufferSize);
     */
    public IVRTrackedCamera_FnTable.GetCameraFrameSize_callback GetCameraFrameSize;

    /*
      EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetCameraIntrinisics)(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, HmdVector2_t * pFocalLength, HmdVector2_t * pCenter);
     */
    public IVRTrackedCamera_FnTable.GetCameraIntrinisics_callback GetCameraIntrinisics;

    /*
      EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetCameraProjection)(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, float flZNear, float flZFar, HmdMatrix44_t * pProjection);
     */
    public IVRTrackedCamera_FnTable.GetCameraProjection_callback GetCameraProjection;

    /*
      EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *AcquireVideoStreamingService)(TrackedDeviceIndex_t nDeviceIndex, TrackedCameraHandle_t * pHandle);
     */
    public IVRTrackedCamera_FnTable.AcquireVideoStreamingService_callback AcquireVideoStreamingService;

    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *ReleaseVideoStreamingService)(TrackedCameraHandle_t hTrackedCamera);
     */
    public IVRTrackedCamera_FnTable.ReleaseVideoStreamingService_callback ReleaseVideoStreamingService;

    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetVideoStreamFrameBuffer)(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pFrameBuffer, uint32_t nFrameBufferSize, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize);
     */
    public IVRTrackedCamera_FnTable.GetVideoStreamFrameBuffer_callback GetVideoStreamFrameBuffer;

    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetVideoStreamTextureSize)(TrackedDeviceIndex_t nDeviceIndex, EVRTrackedCameraFrameType eFrameType, VRTextureBounds_t * pTextureBounds, uint32_t * pnWidth, uint32_t * pnHeight);
     */
    public IVRTrackedCamera_FnTable.GetVideoStreamTextureSize_callback GetVideoStreamTextureSize;
    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetVideoStreamTextureD3D11)(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, void * pD3D11DeviceOrResource, void ** ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize);
     */
    public IVRTrackedCamera_FnTable.GetVideoStreamTextureD3D11_callback GetVideoStreamTextureD3D11;
    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *GetVideoStreamTextureGL)(TrackedCameraHandle_t hTrackedCamera, EVRTrackedCameraFrameType eFrameType, glUInt_t * pglTextureId, CameraVideoStreamFrameHeader_t * pFrameHeader, uint32_t nFrameHeaderSize);
     */
    public IVRTrackedCamera_FnTable.GetVideoStreamTextureD3D11_callback GetVideoStreamTextureGL;
    /*
    EVRTrackedCameraError (OPENVR_FNTABLE_CALLTYPE *ReleaseVideoStreamTextureGL)(TrackedCameraHandle_t hTrackedCamera, glUInt_t glTextureId);
     */
    public IVRTrackedCamera_FnTable.GetVideoStreamTextureD3D11_callback ReleaseVideoStreamTextureGL;

    public interface GetCameraErrorNameFromEnum_callback extends Callback {

        Pointer apply(int eCameraError);
    };

    public interface HasCamera_callback extends Callback {

        int apply(int nDeviceIndex, Pointer pHasCamera);
    };

    public interface GetCameraFrameSize_callback extends Callback {

        int apply(int nDeviceIndex, int eFrameType, IntByReference pnWidth, IntByReference pnHeight, IntByReference pnFrameBufferSize);
    };

    public interface GetCameraIntrinisics_callback extends Callback {

        int apply(int nDeviceIndex, int eFrameType, HmdVector2_t pFocalLength, HmdVector2_t pCenter);
    }

    public interface GetCameraProjection_callback extends Callback {

        int apply(int nDeviceIndex, int eFrameType, float flZNear, float flZFar, HmdMatrix44_t pProjection);
    }

    public interface AcquireVideoStreamingService_callback extends Callback {

        int appply(int nDeviceIndex, IntByReference pHandle);
    }

    public interface ReleaseVideoStreamingService_callback extends Callback {

        int appply(int hTrackedCamera);
    }

    public interface GetVideoStreamFrameBuffer_callback extends Callback {

        int appply(int hTrackedCamera, int eFrameType, Pointer pFrameBuffer, int nFrameBufferSize, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
    }

    public interface GetVideoStreamTextureSize_callback extends Callback {

        int appply(int nDeviceIndex, int eFrameType, VRTextureBounds_t pTextureBounds, IntByReference pnWidth, IntByReference pnHeight);
    }

    public interface GetVideoStreamTextureD3D11_callback extends Callback {

        int apply(int hTrackedCamera, int eFrameType, Pointer pD3D11DeviceOrResource, PointerByReference ppD3D11ShaderResourceView, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
    }

    public interface GetVideoStreamTextureGL_callback extends Callback {

        int apply(int hTrackedCamera, int eFrameType, IntByReference pglTextureId, CameraVideoStreamFrameHeader_t pFrameHeader, int nFrameHeaderSize);
    }

    public interface ReleaseVideoStreamTextureGL_callback extends Callback {

        int apply(int hTrackedCamera, int glTextureId);
    }

    public IVRTrackedCamera_FnTable() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("GetCameraErrorNameFromEnum", "HasCamera", "GetCameraFrameSize",
                "GetCameraIntrinisics", "GetCameraProjection", "AcquireVideoStreamingService", "ReleaseVideoStreamingService",
                "GetVideoStreamFrameBuffer", "GetVideoStreamTextureSize", "GetVideoStreamTextureD3D11", "GetVideoStreamTextureGL",
                "ReleaseVideoStreamTextureGL");
    }

    public IVRTrackedCamera_FnTable(Pointer peer) {
        super(peer);
        read();
    }

    public static class ByReference extends IVRTrackedCamera_FnTable implements Structure.ByReference {

    };

    public static class ByValue extends IVRTrackedCamera_FnTable implements Structure.ByValue {

    };
}

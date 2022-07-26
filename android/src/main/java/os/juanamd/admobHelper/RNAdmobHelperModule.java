package os.juanamd.admobHelper;

import android.util.Log;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import com.google.android.gms.ads.MobileAds;

public class RNAdmobHelperModule extends ReactContextBaseJavaModule {

	private static final String TAG = "RNAdmobHelper";

	public RNAdmobHelperModule(ReactApplicationContext reactContext) {
		super(reactContext);
	}

	@Override
	public String getName() {
		return TAG;
	}

	@ReactMethod
	public void initialize(final Promise promise) {
		try {
			MobileAds.initialize(getReactApplicationContext());
			promise.resolve(null);
		} catch (Exception e) {
			promise.reject(e);
		}
	}

	@ReactMethod
	public void setAppVolume(final float volume, final Promise promise) {
		try {
			MobileAds.setAppVolume(volume);
			promise.resolve(null);
		} catch (Exception e) {
			promise.reject(e);
		}
	}

	@ReactMethod
	public void setAppMuted(final boolean muted, final Promise promise) {
		try {
			MobileAds.setAppMuted(muted);
			promise.resolve(null);
		} catch (Exception e) {
			promise.reject(e);
		}
	}

}

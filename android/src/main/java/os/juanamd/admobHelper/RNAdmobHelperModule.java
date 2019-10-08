package os.juanamd.admobHelper;

import android.content.Intent;
import android.os.Build;
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
	public void setAppVolume(final float volume, final Promise promise) {
		try {
			MobileAds.setAppVolume(volume);
			promise.resolve(null);
		} catch(Exception e) {
			promise.reject(e);
		}
	}

}

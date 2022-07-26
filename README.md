# react-native-admob-helper
Provides access to some methods from MobileAds class that are missing from react-native-firebase's Admob solution.

Includes TypeScript type definitions.

## Install
	yarn add https://github.com/juanamd/react-native-admob-helper.git

From version 2.0.0 it is required that you specify your preferred [MobileAds](https://developers.google.com/android/reference/com/google/android/gms/ads/MobileAds) version in your project level build.gradle file, like so:
```groovy
buildscript {
	ext {
		googleMobileAds = "21.0.0"
	}
}
```
This allows you to match the version that your Admob implementation uses.

## Usage
```typescript
import AdmobHelper from "react-native-admob-helper";

async setAdsVolume() {
	try {
		// initialize() only required if not called from Admob
		await AdmobHelper.initialize(); 
		await AdmobHelper.setAppVolume(0.5);
		await AdmobHelper.setAppMuted(true);
	} catch (error) {
		console.warn(error.toString())
	}
}

```

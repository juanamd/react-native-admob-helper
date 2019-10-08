# react-native-admob-helper
Provides access to some methods from MobileAds class that are missing from react-native-firebase's Admob solution.

## Usage
```javascript
import AdmobHelper from "react-native-admob-helper";

async setAdsVolume() {
    try {
        // Admob should be initialized before calling this.
        await AdmobHelper.setAppVolume(0.5);
    } catch (error) {
        console.warn(error.toString())
    }
}

```

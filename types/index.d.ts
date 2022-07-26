declare module "react-native-admob-helper" {
	export default class {
		static initialize(): Promise<void>;
		static setAppVolume(volume: number): Promise<void>;
		static setAppMuted(muted: boolean): Promise<void>;
	}
}
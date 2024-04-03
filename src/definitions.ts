export interface DeveloperModeCopPlugin {
  isDeveloperModeEnabled(): Promise<{ isEnabled: boolean; }>;
}

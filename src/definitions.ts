export interface DeveloperModeCopPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}

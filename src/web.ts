import { WebPlugin } from '@capacitor/core';

import type { DeveloperModeCopPlugin } from './definitions';

export class DeveloperModeCopWeb
  extends WebPlugin
  implements DeveloperModeCopPlugin
{
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}

import { registerPlugin } from '@capacitor/core';

import type { DeveloperModeCopPlugin } from './definitions';

const DeveloperModeCop = registerPlugin<DeveloperModeCopPlugin>(
  'DeveloperModeCop',
  {
    web: () => import('./web').then(m => new m.DeveloperModeCopWeb()),
  },
);

export * from './definitions';
export { DeveloperModeCop };

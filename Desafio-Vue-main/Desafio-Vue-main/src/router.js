import { createRouter, createWebHashHistory } from 'vue-router';

import BirdsInfo from './pages/BirdsInfo';

const routes = [
  {
    name: 'birds_info',
    path: '/birds_info',
    component: BirdsInfo
  }
];

const router = createRouter({
  routes,
  history: createWebHashHistory(),
});

export default router;

import { createRouter, createWebHashHistory } from 'vue-router';

import PokemonDetails from './pages/PokemonDetail';
import Home from './pages/Home';

const routes = [
  {
    name: 'pokemon_details',
    path: '/pokemon-details',
    component: PokemonDetails,
  },
  {
    name: 'home',
    path: '/',
    component: Home,
  },
];

const router = createRouter({
  routes,
  history: createWebHashHistory(),
});

export default router;

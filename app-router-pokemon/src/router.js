import {createRouter, createWebHashHistory} from 'vue-router';

import PokemonDetails from './pages/PokemonDetail.vue';
import Home from './pages/Home.vue'

const routes = [
    {
        name: 'pokemon_details',
        path: '/pokemon_details/:id',
        component: PokemonDetails,
        props: true,
    },
    {
        name: 'home',
        path: '/home',
        component: Home,
    }
];

const router = createRouter({
    routes,
    history: createWebHashHistory(),
});

export default router;
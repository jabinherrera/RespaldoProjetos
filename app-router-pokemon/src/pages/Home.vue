<template>
    <div>
        <h1>Home</h1>
            <div>
                <pokemon-item v-for="pokemon in pokemons" :key="pokemon.name" :pokemon="pokemon" />
            </div>
    </div>
</template>

<script>
import {listPokemons} from '../services/pokemon.services';
import PokemonItem from '../components/PokemonItem.vue';

export default {
    name: "HomePage",
    components: {
        PokemonItem,
    },
    data() {
        return {
            pokemons: [],
        };
    },
    async mounted(){
        const result = await listPokemons({limit: 50, offset: 0});
        this.pokemons = result.results;
    },
};
</script>

<style>
</style>
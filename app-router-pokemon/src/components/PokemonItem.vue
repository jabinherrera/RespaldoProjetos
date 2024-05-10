<template>
    <div @click="showDetails(pokemon)">
        {{pokemon.name}}
    </div>
</template>

<script>
export default {
    name: "PokemonItem",
    props: {
        pokemon: {
            type: Object,
            default: null,
        },
    },
    methods: {
        showDetails(pokemon) {
            console.log(pokemon);
            const pkmId = pokemon.url.split("/")[6];
            this.$router.push({
                name: "pokemon_details",
                params: {
                id: pkmId,
                },
            });
        },
    },
};
</script>

<style>
</style>
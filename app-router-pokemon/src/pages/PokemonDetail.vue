<template>
    <div>
        <h1>Detalles</h1>
        {{ id }}
    </div>
</template>

<script>
export default {
    name: "PokemonDetail",
    props: {
        id: {
            type: String,
            default: "",
        },
    },
};
</script>

<style>
</style>
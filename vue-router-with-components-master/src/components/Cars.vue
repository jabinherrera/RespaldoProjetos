<template>
  <div v-for="car in cars" :key="car.id">
      <p>Marca: {{ car.brand }}</p>
      <p>Modelo: {{car.model}}</p>
      <p>Año: {{ car.year}} </p>
      <p>Color: {{ car.color}} </p>
      <hr>
    </div>
</template>

<script>
export default {
    name: 'Cars',
    props: {
        cars: Array
    }
}
</script>

<style>

</style>
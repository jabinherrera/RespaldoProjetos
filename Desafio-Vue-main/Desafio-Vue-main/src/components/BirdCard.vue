<template>
    <div v-for="bird in data" :key="bird.id" class="container fluid">
        <div class="row row-cols-md-3 m-auto g-4">
  <div class="col">
    <div class="card">
      <img :src="bird.images.main" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">{{ bird.name.spanish }}</h5>
      </div>
    </div>
  </div>
 
</div>
    </div>
</template>

<script>
import { fetchData } from '../services/bird.services.js';

export default {
  data() {
    return {
      data: [], // Datos obtenidos de la API
    };
  },
  mounted() {
    this.fetchDataFromAPI();
  },
  methods: {
    async fetchDataFromAPI() {
      try {
        this.data = await fetchData();
      } catch (error) {
        console.error(error);
      }
    },
  },
};
</script>

<style>

</style>
<template>
  <div>
    <h1>Lista de Autos</h1>
    <h2>{{carId}}</h2>
    <car-component :cars=autos></car-component>
  </div>
</template>

<script>

import CarComponent from '../components/Cars.vue'

export default {
  name: "UsersView",
  components: {
      CarComponent
  },
  data(){
      return {
          autos: [{
              model: 'modelo',
              year: '2020',
              color: 'rojo'
          }],
          carId: 0
      }
  },
  mounted(){
      console.log(this.$route)
      this.carId = this.$route.query.autoId
  }
};
</script>

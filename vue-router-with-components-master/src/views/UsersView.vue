<template>
  <div>
    <h1>Lista de USUARIOS (autos old)</h1>
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
            brand: "marca",
              model: 'm',
              year: '2000',
              color: 'blue'
          },
          {
            brand: "b",
              model: 'me',
              year: '2010',
              color: 'k'
          }]
      }
  }
};
</script>

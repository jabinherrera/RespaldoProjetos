<template>
  <CarouselBirds/>
  <router-view></router-view>
</template>

<script>
import CarouselBirds from './components/CarouselBirds.vue'

export default {
  name: 'App',
  components: {
    CarouselBirds
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>

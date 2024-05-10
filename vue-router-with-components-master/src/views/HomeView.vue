<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <button class="btn btn-primary" @click="goToCars(1)" >Ir a auto 1</button>
    <button class="btn btn-primary" @click="goToCars(2)" >Ir a auto 2</button>
    <button class="btn btn-primary" @click="goToCars(3)" >Ir a auto 3</button>
    <button class="btn btn-primary" @click="goToCars(4)" >Ir a auto 4</button>
    <button class="btn btn-primary" @click="goToCars(5)" >Ir a auto 5</button>
  </div>
</template>

<script>
export default {
  name: 'HomeView',
  methods: {
    goToCars(id){
      this.$router.push({name: 'cars', query: {autoId: id}})
    }
  }
}
</script>

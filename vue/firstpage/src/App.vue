<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <Navbar/>

  <div>
    <Navbar alertName="a"></Navbar>
    <Navbar alertName="b"></Navbar>
    <Navbar alertName="c"></Navbar>
    <Navbar alertName=""></Navbar>
  </div>
</template>

<script>
import Navbar from './components/Navbar.vue'


export default {
  name: 'App',
  components: {
    Navbar,
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
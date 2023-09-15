<script setup lang="ts">
  import { RouterView } from 'vue-router'
  import HeaderNavigate from './components/HeaderNavigate.vue';
  import { provide } from 'vue';
  
  const funcaoDoPai = () => {
      alert('Função do Pai foi chamada no componente Filho!');
  };

    provide('funcaoPai', funcaoDoPai);
    
</script>

<template>
  <HeaderNavigate />
  <div role="main">
    <RouterView />
  </div>
</template>

<style scoped>

div[role="main"]{
  width:100%;
  overflow-y: auto;
  display: flex;
  flex: content;
  flex-direction: column;
  flex-wrap: wrap;
  align-content: space-around;
}
</style>

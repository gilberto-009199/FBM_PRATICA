<script setup lang="ts">
  import ProductView from '@/components/ProductView.vue';
  import Axios, { type AxiosObservable } from  'axios-observable';
  
  import { reactive, toRefs, computed, onMounted } from "vue";
  
  const state = reactive({
    listProdutcs:[]
  });

  const fetchProducts = () => {
    Axios
      .get("http://localhost:8080/v1/product/")
      .subscribe((response) => {
        state.listProdutcs = response.data.data; // 👈 get just results
      });
  };

  fetchProducts()
</script>
<template>
  <main>
    <h1>HOME</h1>
    <ProductView
      v-for="data in state.listProdutcs"
      :produto="data" 
      :key="data"
    />
  </main>
</template>

<script lang="ts">

import ProductViewModel from '@/components/ProductViewModel.vue';

import AppService from '@/core/services/AppService'
import { ProductService, type Message } from '@/core/services/ProductsService'
import { Observable } from 'rxjs';

export default{
  components:{
    ProductViewModel
  },
  data(){
      return {
          listProdutcs: [],
      }
  },
  methods:{ 

    reciverEmit: function(){
      alert("Emit!!!")
    }

  },
  mounted(){
    let appService = new AppService();
    let productService =  new ProductService(appService);
    productService.getAll()
    .subscribe(res=>{
      let body = res.data;
      if(body.status){
        this.listProdutcs = body.data;
      }
    })
  }
}
</script>

<template>
  <div class="container">
    <ProductViewModel v-for="data in listProdutcs" :produto="data" :key="data" @eventxyz="reciverEmit"/>
  </div>
</template>

<style scoped>
  .container{
    width: 100%;
    padding-top: 32px;
    display: flex;
    overflow-y: auto;
    flex-wrap: wrap;
    flex-direction: row;
    justify-content: space-evenly;
  }
  ProductViewModel{
    display: flex;
    flex-direction: row;
    flex-wrap: wrap;
  }
</style>

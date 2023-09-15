<script lang="ts">
import type { PropType } from 'vue';
import { inject } from 'vue';
    var ctx = {};
    interface ProdutoModel{
        id: number
        name: string
    }
    export default {
        name:'ProductViewModel',
        props: {
            produto: {
              type: Object as PropType<ProdutoModel>,
              required: true,
            },
        },
        setup(){  ctx.pai = inject('funcaoPai') },
        methods:{
            runProviderFun: function(){
                console.log("oiiii")
                
                if(ctx.pai)ctx.pai();
            },
            runEmitExample: function(){
                this.$emit("eventxyz")
            }
        },
        data(){
            return {
                message: 'hellow world',
            }
        }
    }
</script>

<template>
    <div class="produto-item">
        <img height="130" width="160" @click="runEmitExample">
        <h3 class="produto-item-name" > {{ produto.name }} </h3>
        <a class="produto-item-id" @click="runProviderFun">Ver</a>
    </div>
</template>
<style scoped>
    .produto-item{
        padding: 10px 21px;
        margin: 3px;
        background-color: #eee;
        border-radius: 8px;
    }
    .produto-item-id{
        font-size: 1.4em;
        font-weight: bold;
        text-align: end;
        
        display: block;
    }
    .produto-item-name{
        text-align: center;
        font-size: 1.2em;
    }
</style>
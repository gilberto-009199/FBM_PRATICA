<script setup lang="ts">
    import { RouterLink } from 'vue-router'
</script>

<template>
    <header>
        <nav>
            <RouterLink class="header-link" to="/cart">Cart</RouterLink>
            <RouterLink class="header-link" to="/">Home</RouterLink>
        </nav>
    </header>
</template>

<style scoped>
header{

  width: 100%;
  display: block;
  overflow: auto;
  background: #eee;
  padding: 14px 15px 4px 5px;
  display: flex;
  flex-direction: row-reverse;
}
.header-link{
    font-size: 1.4em;
    text-transform: uppercase;
    font-weight: bold;
    padding: 10px 12px;
    display: inline-block;
    float: right;
}
</style>
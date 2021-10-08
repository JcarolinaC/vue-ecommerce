<template>
<Basiclayouts>
    <h1>estamos en login</h1>
    <router-link to="/register">
    Crear una cuenta 
    </router-link>
    </Basiclayouts>
</template>

<script>
import Basiclayouts from '../layouts/Basiclayouts.vue';
export default {
    name: 'login',
    components: {
    Basiclayouts,
  },
}
</script>

<style>

</style>
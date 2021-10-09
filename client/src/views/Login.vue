<template>
<Basiclayouts>
    <h1>estamos en login</h1>
    <router-link to="@/Register">
    Crear una cuenta 
    </router-link>
    </Basiclayouts>
</template>

<script>
import Basiclayouts from '@/layouts/Basiclayouts.vue';
export default {
    name: 'Login',
    components: {
    Basiclayouts,
  },
}
</script>

<style>

</style>
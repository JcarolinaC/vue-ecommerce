<template>
    <div class="Basic-layout">
        <Menu/>
    
    <div class="ui container">
        <slot />
    </div>
    </div>
</template>

<script>
import Menu from '../components/menu.vue';

export default {
    name: "Basiclayouts",
    components: {
        Menu,
    
        },
};
</script>

<style>

</style>
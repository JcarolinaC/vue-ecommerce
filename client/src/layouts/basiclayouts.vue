<template>
<div class="basic-layout">
    <menu/>
    <div class="ui container">
        <slot />
    </div>
</template>

<script>
import Menu from '@/components/Menu.vue';

export default {
    name: "Basiclayouts",
    components: {
        Menu,
    
        },
};
</script>

<style>

</style>
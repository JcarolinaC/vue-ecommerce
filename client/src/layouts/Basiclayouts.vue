<template>
<div class="basic-layout">
    <Menu/>
    <div class="ui container">
        <slot />
    </div>
     <Cart/>
</div>
</template>

<script>
import Menu from '../components/Menu.vue';
import Cart from '@/components/Cart/Cart.vue';

export default {
    name: "Basiclayouts",
    components: {
        Menu,
        Cart,
        },
};
</script>

<style>

</style>
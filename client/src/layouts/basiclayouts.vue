<template>
<div class="basic-layout">
    <menu/>
    <div class="ui container">
        <slot />
    </div>
</div>
</template>

<script>
import Menu from '@/components/Menu.vue';

export default {
    name: "basiclayouts",
    components: {
        Menu
    }
}

</script>
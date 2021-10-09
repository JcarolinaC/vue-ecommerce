<template>
    <Harmonylayout></Harmonylayout>
</template>

<script>
import Harmonylayout from '@/layouts/Harmonylayout.vue';
import Head from '@/components/Head.vue';

// @ is an alias to /src

export default {
  name: 'Index',
    components: {
        Harmonylayout,
        Head,
    },
  };
</script>

<style>
.button{
    background-color: aquamarine;
}

@import'~bootstrap/dist/css/bootstrap.css';
</style>
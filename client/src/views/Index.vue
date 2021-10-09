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
  @import'~bootstrap/dist/css/bootstrap.css';
.button{
    background-color: aquamarine;
}

</style>
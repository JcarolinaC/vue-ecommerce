<template>
    <Basiclayouts>
    <h2>estamos en la categoria</h2>
    </Basiclayouts>
</template>

<script>
import {onMounted} from 'vue';

import Basiclayouts from '../layouts/Basiclayouts.vue'

import {getCategoriesApi} from '../api/category'

export default {
    name: 'Category',
	components: { 
        Basiclayouts 
        },
    watch:{
        $router(to, from){
            console.log(to)
        }
    },
    setup() {
        onMounted( async() => {
            const categories = await getCategoriesApi('Carros')
            console.log(categories)
        })
    }
};

</script>

<style>

</style>
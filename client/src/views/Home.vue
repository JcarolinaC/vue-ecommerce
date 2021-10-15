<template>
  <Basiclayouts>
    <h2> Harmony un estilo de vida diferente </h2>
    <Carousel/>
    <hr>
    <h1>Ultimos productos</h1>
    <div class="ui grid">
      <div class="sisxteen wide mobile eight wide tablet  four wide computer  column" v-for="product in products" :key="product.id">
        <Product :product="product" />
      </div>
    </div>
    
    

  </Basiclayouts>
</template>

<script>
import { ref, onMounted } from "vue";
import Basiclayouts from '@/layouts/Basiclayouts.vue';
import { getProducts } from "@/api/product.js";
import Product from "@/components/Product.vue";
// @ is an alias to /src

import Carousel from '@/components/Carousel.vue'
import Card from '@/components/Card.vue'


export default {
  name: 'Home',
    components: {
      Basiclayouts,
      Product,
        Carousel,
        Card,
    },
    setup(){
      let products = ref(null);

      onMounted(async () => {
        const response = await getProducts(20);
        products.value = response;
        // console.log(response);
      });
	  return {
		products,
	  }
    }
  };
</script>

<template>
	<Basiclayouts>
		<h2>estamos en la categoria</h2>
		<div class="ui grid">
			<div
				class="sisxteen wide mobile eight wide tablet four wide computer column"
				v-for="product in products"
				:key="product.id"
			>
				<Product :product="product" />
			</div>
		</div>
	</Basiclayouts>
</template>

<script>
import { ref, onMounted } from "vue";
import { useRoute } from "vue-router";
import Basiclayouts from "../layouts/Basiclayouts.vue";
import Product from "../components/Product.vue";
import { getProductsCategory } from "../api/product.js";
import { getCategoriesApi } from "../api/category.js";

export default {
	name: "Category",
	components: {
		Basiclayouts,
		Product,
	},
	watch: {
		$router(to, from) {
			this.getProducts(to.params.category);
		},
	},
	setup() {
		let products = ref(null);
		const { params } = useRoute();

		onMounted(() => {
			getProducts(params.Category);
		});

		const getProducts = async (category) => {
			const response = await getProductsCategory(category);
			products.value = response;
		};

		return {
			getProducts,
			products,
		};
	},
};
</script>

<style></style>
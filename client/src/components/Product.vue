<template>
	<div class="ui card product">
		<div class="image">
			<img :src="API_URL + product.image.url" :alt="product.name" />
		</div>
		<div class="content">
			<div class="header">{{ product.name }}</div>
			<div class="description">{{ product.price }} $</div>
		</div>
		<div class="ui button primary" @click="addProductCart(product.id)">
			Comprar
		</div>
	</div>
</template>

<script>
import { API_URL } from "../utils/constants.js";
import { addProductCartApi } from "../api/cart.js";

export default {
	name: "Product",
	props: {
		product: Object,
	},
	setup(props) {
		const addProductCart = (idProduct) => {
			console.log(idProduct);
			console.log(props.product.id);
			addProductCartApi(idProduct);
		};
		return {
			API_URL,
			addProductCart,
		};
	},
};
</script>

<style lang="scss" scoped>
.product {
	&:hover {
		.ui.button {
			min-height: 36px;
		}
	}
}
.ui.button {
	max-height: 0;
	min-height: 0;
	overflow: hidden;
	padding: 0;
	display: flex;
	align-items: center;
	justify-content: center;
	transition: min-height 0.6s ease;
}
</style>
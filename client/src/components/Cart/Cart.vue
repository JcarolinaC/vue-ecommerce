<template>
	<div class="cart" :class="{open: showCart}">
		<h2>esto es el carrito</h2>
		<button>Cerrar</button>
	</div>
</template>

<script>
import { computed } from 'vue';
import { useStore } from 'vuex';

export default {
	name: "Cart",
    setup() {
        const store = useStore();
        const showCart = computed(() => store.state.showCart);

        return {showCart};
    },
};
</script>

<style lang="scss" scoped>
.cart-dimmer {
	opacity: 0;
	transition: opacity 0.5s ease;
	&.open {
		position: fixed;
		top: 0;
		left: 0;
		width: 100%;
		height: 100%;
	}
}
.cart {
	position: fixed;
	top: 0;
	right: 0;
	width: 400px;
	height: 100vh;
	background-color: #fff;
	box-shadow: 0px 0px 26px 5px rgba(0, 0, 0, 0.75);
	display: flex;
	flex-direction: column;
	justify-content: space-between;
	transition: transform 0.9s ease;
	transform: translateX(150%);
	&.open {
		transform: translateX(0);
	}
}
</style>
<template>
<div>
    <div class="cart-dimmer" :class="{ open: showCart }" @click="closeCart"/>
	<div class="cart" :class="{open: showCart}">
            <CardHeader :closeCart="closeCart" />
		<!-- <button @click="closeCart">Cerrar</button> -->
	</div>
</div>
</template>

<script>
import { computed } from 'vue';
import { useStore } from 'vuex';
import CartHeader from '@/components/Cart/CartHeader';

export default {
	name: "Cart",
    components: {
        CartHeader
    },
    setup() {
        const store = useStore();
        const showCart = computed(() => store.state.showCart);

        const closeCart =  () => {
            store.commit('setShowCart', false);
        }

        return {showCart, closeCart};
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
        background-color: #000;
        opacity: 0.7;
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
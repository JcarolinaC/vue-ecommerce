<template>
    <div class="ui secondary Menu">
        <div class="ui container">
                <div class="left Menu">
                    <router-link class="item" to="/">
                        <img class="ui small image" src="../assets/logo.png" alt="Ecomerce" />
                        <p>categoria...</p>
                    </router-link>
                </div>
                <div class="right Menu">
                <router-link class="item" to="/">
                    <i class="home icon"></i>
                    Inicio
                </router-link>
                <!-- <router-link class="item" to="/products">
                    <i class="shop icon"></i>
                    Productos
                </router-link>
                <router-link class="item" to="/cart">
                    <i class="cart icon"></i>
                    Carrito
                </router-link>
                <router-link class="item" to="/checkout">
                    <i class="payment icon"></i>
                    Checkout
                </router-link>
                <router-link class="item" to="/contact">
                    <i class="mail icon"></i>
                    Contacto
                </router-link>
                <router-link class="item" to="/about">
                    <i class="info circle icon"></i>
                    Acerca de
                </router-link> -->
            
            </div>
        </div>
    </div>
</template>

<script>
import Menu from '@/components/Menu.vue'
export default {
    name:'Menu',
    components: {
        Menu,
    }
};
</script>

<style lang="scss" scoped>
.ui.menu.secondary {
    background-color: rgb(247, 170, 183);

    .item {
        color: white;
        &:hover {
            color:rgb(60, 33, 214);
        }
    }
    .menu.left {
        width: 50%;
        .ui.image {
            width: 70px;
        }
    }
    .menu.right {
        width: 50%;
        justify-content: flex-end;
        .logout,
        .cart {
            &:hover {
                cursor: pointer;
            }
        }
    }
}

</style>
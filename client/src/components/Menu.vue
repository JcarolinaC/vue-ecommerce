<template>
    <div class="ui secondary menu">
        <div class="ui container">
                <div class="left menu">
                    <router-link class="item" to="/">
                        <img class="ui small image" src="../assets/logo.png" alt="Ecomerce" />
                    </router-link>
                     <div class="item"  v-for="category in categories" :key="category.id" >
                            <router-link class="item" :to="category.slug">
                                {{ category.title }}
                            </router-link>
                        </div>
                </div>
                <div class="right menu">
                <router-link class="item" to="/">
                    <i class="home icon"></i>
                    Inicio
                </router-link>
                <router-link class="item" to="/login" v-if="!token">
                    <i class="sign-in icon"></i>
                    Iniciar sesión
                </router-link>
                <template v-if="token">
                    <router-link class="item" to="/profile">
                        <i class="user icon"></i>
                        Perfil
                    </router-link>
                    <!-- <router-link class="item" to="/logout">
                        <i class="sign-out icon"></i>
                        Cerrar sesión
                    </router-link> -->
                    <span class="ui item logout" @click="logout">
                        <i class="sign-out icon"></i>
                        Cerrar sesión
                    </span>
                </template>
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
import { ref, onMounted } from "vue";

import Menu from '@/components/Menu.vue'
import { getTokenApi, deleteTokenApi } from "../api/token.js";

import { getCategoriesApi } from "../api/category.js";

export default {
    name:'Menu',
    components: {
        Menu,
    },
    setup() {
        let categories = ref(null);

        onMounted(async() => {
            const response = await getCategoriesApi();
            categories.value = response;
            // console.log(response);
        });

        const token = getTokenApi();

        const logout = () => {
            // localStorage.removeItem('token');
            // this.$router.push('/');
            deleteTokenApi();
            location.replace('/');
            console.log('logout');
        }
        return {
            token,
            logout,
            categories
        }
    },
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
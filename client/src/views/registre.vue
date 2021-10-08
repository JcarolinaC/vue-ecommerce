<template>
    <Basiclayouts>
        <div class="register">
            <h2>Registro de usuario</h2>
            <form class="ui form">
            <div class="field">
                <input type="text" name="first-name" placeholder="Nombre de Usuario">
            </div>
            <div class="field">
                <input type="text" name="last-name" placeholder="Correo Electronico">
            </div>
            <div class="field">
                <input type="text" name="last-name" placeholder="Contraseña">
            </div>
            <button class="ui button fluid primary" type="submit">Crear Usuario</button>
            </form>

            <router-link to="/login">
                Iniciar Sesion
            </router-link>
        </div>
    </Basiclayouts>
</template>

<script>
import Basiclayouts from '@/layouts/basiclayouts.vue'
export default {
	components: { 
        Basiclayouts },
    name: 'Register',
}
</script>


<style lang='scss' scoped>
.register{
    text-align: center;
    h2{
        margin: 50px 0 30px 0px;
    }
    .ui.form{
        max-width: 300px !important;
        margin: 0 auto;
        margin-bottom: 10px;
        input.error{
            border-color: #faa !important;
            background-color: #ffeded;
        }
    }
}


</style>
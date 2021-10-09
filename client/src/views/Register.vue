<template>
<Basiclayouts>
    <div class="register">
        <h2> Registro de usuario </h2>
        <form class="ui form" @submit.prevent="Register">
            <div class="field">
                Nombre de usuario: 
                <input type="text" 
                placeholder="Nombre de usuario" 
                v-model="formData.username"
                :class="{ error: formError.username }"
                />
            </div>
            <div class="field">
                Correo Electrónico:
                <input type="text" 
                placeholder="Correo Electrónico" 
                v-model="formData.email"
                :class="{ error: formError.email }"
                />
            </div>
            <div class="field">
                Contraseña
                <input type="Password" 
                placeholder="Constraseña" 
                v-model="formData.password"
                :class="{ error: formError.password }"
                />
            </div>
            <button type="submit" class="ui button fluid primary">
                Crear Usuario
            </button>
        </form>
        <router-link to="/login">
        Iniciar sesion
        </router-link>
    </div>
</Basiclayouts>
</template>

<script>
import { ref } from 'vue';
import { useRouter } from 'vue-router';
import * as Yup from 'yup';
import Basiclayouts from '@/layouts/Basiclayouts.vue';
import { registerApi } from '@/api/user';
export default {
    name: 'Register',
    components: {
    Basiclayouts,
},
setup() {
    let formData = ref({});
    let formError = ref({});
    const router = useRouter();
    const schemaForm = Yup.object().shape({
        username: Yup.string().required(true),
        email: Yup.string().email(true).required(true),
        password: Yup.string().required(true),
    });
    const Register = async () => {
        
        formError.value = {};

            try {
                await schemaForm.validate(formData.value, { abortEarly: false});  
                try {
                    const response = await RegisterApi(formData.value);
                    router.push("/login");
                } catch (error) {
                    console.log(error);
                }
                } catch (error) {
                error.inner.forEach((err) => {
                    formError.value[err.path] =err.message;
                });
            }
        };

    return {
        formData,
        Register,
        formError,
    };
},
};
</script>

<style lang="scss" scoed>
    .Register {
        text-align: center;
        h2 {
            margin: 50px 0 30px 0 ;
        }
    .ui.form {
        max-width: 300px !important;
        margin: 0 auto;
        margin-bottom: 10px;
        input.error {
            border-color: #faa;
            background-color: #ffeded;
        }
    }
    }

</style>
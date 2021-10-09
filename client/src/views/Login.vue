<template>
	<Basiclayouts>
		<div class="login">
			<h2>Iniciar sesión</h2>
			<form class="ui form" @submit.prevent="login" >
				<div class="field">
					<input 
					type="text" 
					placeholder="Nombre de usuario" 
					v-model="formData.identifier"
					:class="{'error': formError.identifier}"
					/>
				</div>
				<div class="field">
					<input 
					type="password" 
					placeholder="Contraseña" 
					v-model="formData.password"
					:class="{'error': formError.password}"
					/>
				</div>
				<button 
				type="submit" 
				class="ui button fluid primary"
				:class="{ loading }"
				>
					Entrar
				</button>
			</form>
			<router-link to="@/Register"> Crear una cuenta </router-link>
		</div>
	</Basiclayouts>
</template>

<script>
import { ref } from "vue";
import { useRouter } from "vue-router";
import * as Yup from "yup";
import Basiclayouts from "@/layouts/Basiclayouts.vue";
import { loginApi } from "../api/user.js";
export default {
	name: "Login",
	components: {
		Basiclayouts,
	},
	setup(){
		let formData = ref({});
		let formError = ref({});
		let loading = ref(false);

		const router = useRouter();
		
		const schemaForm = Yup.object().shape({
			identifier: Yup.string().required("El nombre de usuario es requerido"),
			password: Yup.string().required("La contraseña es requerida"),
		});
		const login =  async () => {
			formError.value = {};
			try {
				loading.value = true;
				await schemaForm.validate(formData.value, {abortEarly: false});
				try {
					const response = await loginApi(formData.value);
					console.log(response);
					if (!response.jwt) throw 'El usuario o contraseña no son validos';
					// setTokenApi(response.jwt);
					router.push("/");
				} catch (error) {
					console.log(error);
				}
			} catch (error) {
				error.inner.forEach(err => {
					formError.value[err.path] = err.message;
				});
			} finally {
				loading.value = false;
			}
			
			console.log('login...');
			console.log(formData.value);
		};
		return{
			formData,
			formError,
			loading,
			login,
		};
	}
};
</script>

<style lang="scss" scoped>
.login {
	text-align: center;
	> h2 {
		margin: 50px 0 30px 0;
	}
}
.ui.form {
	max-width: 300px !important;
	margin: 0 auto;
	margin-bottom: 10px;
	input.error {
		border-color: #e05d44 !important;
		background-color: #ffeded;
	}
}
</style>
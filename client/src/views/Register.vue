<template>
	<Basiclayouts>
		<div class="Register">
			<h2>Registro de usuario</h2>
			<form class="ui form" @submit.prevent="Register">
				<div class="field">
					Nombre de usuario:
					<input
						type="text"
						placeholder="Nombre de usuario"
						v-model="formData.username"
						:class="{ error: formError.username }"
					/>
				</div>
				<div class="field">
					Correo Electrónico:
					<input
						type="text"
						placeholder="Correo Electrónico"
						v-model="formData.email"
						:class="{ error: formError.email }"
					/>
				</div>
				<div class="field">
					Contraseña
					<input
						type="Password"
						placeholder="Constraseña"
						v-model="formData.password"
						:class="{ error: formError.password }"
					/>
				</div>
				<button type="submit" 
				class="ui button fluid primary"
				:class="{ loading }"
				>
					Crear Usuario
				</button>
			</form>
			<router-link to="/login"> Iniciar sesion </router-link>
		</div>
	</Basiclayouts>
</template>

<script>
import { ref, onMounted} from "vue";
import { useRouter } from "vue-router";
import * as Yup from "yup";
import Basiclayouts from "@/layouts/Basiclayouts.vue";
import { registerApi } from "../api/user.js";
import { getTokenApi } from "../api/token.js"; 
export default {
	name: "Register",
	components: {
		Basiclayouts,
	},
	setup() {
		let formData = ref({});
		let formError = ref({});
		let loading = ref(false);
		const router = useRouter();
		const token = getTokenApi();

		onMounted(() => {
			if (token) {
				router.push("/");
			}
		});

		const schemaForm = Yup.object().shape({
			username: Yup.string().required(true),
			email: Yup.string().email(true).required(true),
			password: Yup.string().required(true),
		});
		const Register = async () => {
			formError.value = {};
			loading.value = true;

			try {
				await schemaForm.validate(formData.value, { abortEarly: false });
				try {
					const response = await registerApi(formData.value);
					router.push("/Login");
					// console.log(response);
				} catch (error) {
					console.log(error);
				}
			} catch (error) {
				error.inner.forEach((err) => {
					formError.value[err.path] = err.message;
				});
			}
			loading.value = false;
		};

		return {
			formData,
			Register,
			formError,
			loading,
		};
	},
};
</script>

<style lang="scss" scoped>
.Register {
	text-align: center;
	h2 {
		margin: 50px 0 30px 0;
	}
	.ui.form {
		max-width: 300px !important;
		margin: 0 auto;
		margin-bottom: 10px;
		input.error {
			border-color: rgb(255, 64, 64);
			background-color: #ffeded;
		}
	}
}
</style>
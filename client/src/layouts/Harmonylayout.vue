<template>
    <div class="basic-layout container">
        <Head/>
        <Navbar/>
        <h1>Disfruta de la Armonia<span class="Harmony un concepto de belleza diferente "></span></h1>
        <Carousel/>
        <div class="card-group">
            <Card
                imageName="abc.jpg"
                text="Harmony es una empreesa creada pensando en mejorar la
                calida de vida de las personas, inicialmente nos
                dedicabamos a la estetica y a la belleza, durante el
                tiempo de pandemia nacio Harmony Garden como nosotros
                decimos un hijo de nuestro Harmony y poco a poco fuimos
                consstruyendo una idea diferente de belleza en donde
                integramos la alimentacion saludable y cultivada por
                nosotros mismos como pilar de nuestra vision,
                actualmente nos encontramos desarrollando diferentes
                tipos de proyectos al interior para poder ofertar
                servicios de calidad, dentro de ellos la alimentacion y
                el entrenamiento"
                textMuted="conoce mas de nosotros en nuestras redes sociales"
            />
             <Card
                imageName="ejercicio.jpg"
                text="This card has supporting text below as a natural lead-in to additional content"
                textMuted="ok lets go"
            />
             <Card
                imageName="estilo.jpg"
                text="This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action."
                textMuted="Last updated 3 mins ago"
            />
            <div class="row g-0 bg-light position-relative">
				<div class="col-md-6 mb-md-0 p-md-4">
					<h5 class="mt-0">Columns with stretched link</h5>
					<p>
						Another instance of placeholder content for this other
						custom component. It is intended to mimic what some
						real-world content would look like, and we're using it
						here to give the component a bit of body and size.
					</p>
					<a href="#" class="stretched-link">Go somewhere</a>
				</div>
				<div class="col-md-6 p-4 ps-md-0">
					<img src="estilo.jpg" class="w-100" alt="estilo.jpg" />
				</div>
			</div>
			<div class="d-flex position-relative">
				<img src="ejercicio.jpg" class="w-100" alt="ejercicio.jpg" />
				<div>
					<h5 class="mt-0">Custom component with stretched link</h5>
					<p>
						This is some placeholder content for the custom
						component. It is intended to mimic what some real-world
						content would look like, and we're using it here to give
						the component a bit of body and size.
					</p>
					<a href="#" class="stretched-link">Go somewhere</a>
				</div>
			</div>
        </div>
        <!-- <div class="ui container">
            <slot />
        </div> -->
    </div>
</template>

<script>
import Navbar from '@/components/Navbar.vue'
import Head from '@/components/Head.vue'
import Carousel from '@/components/Carousel.vue'
import Card from '@/components/Card.vue'
export default {
    name: "Harmonylayout",
	components: { 
        Navbar,
        Head,
        Carousel,
        Card,
    },
}
</script>

<style>

</style>
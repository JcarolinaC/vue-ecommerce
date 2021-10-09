<template>
    <div class="basic-layout">
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
                textMuted="Last updated 3 mins ago"
            />
             <Card
                imageName="estilo.jpg"
                text="This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action."
                textMuted="Last updated 3 mins ago"
            />
        </div>
        <div class="ui container">
            <slot />
        </div>
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
<template>
<div class="card">
    <img class="card-img-top" src="{{src}}" />
    <div class="card-body">
        <p class="card-text">
            {{text}}
        </p>
        <p class="card-text">
            <small class="text-muted">
                {{textMuted}}
            </small>
        </p>
    </div>
</div>
</template>

<script>
import Card from '@/components/Card.vue';

export default {
    name: "Card",
    components: {
        Card,
        },
    props: {
        src: {
            type: String,
            default: '',
        },
        text: {
            type: String,
            default: '',
        },
        textMuted: {
            type: String,
            default: '',
        },
    },
};
</script>

<style>

</style>
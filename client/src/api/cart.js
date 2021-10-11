import { API_URL, PRODUCTS } from "../utils/constants";

export function addProductCartApi(idProduct) {
    const productlist = getCartApi();
    productlist.push(idProduct);

    localStorage.setItem(PRODUCTS, JSON.stringify(productlist));
}

export function getCartApi() {
    const productlist = JSON.parse(localStorage.getItem(PRODUCTS));

    if (!productlist) {
        return [];
    }
    
    return productlist;
}
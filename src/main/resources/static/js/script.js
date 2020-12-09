function cerrarr_vt(e){
    e.parentNode.style.display="none";
}
function mostrar_vt(e){
    document.getElementById(e).style.display="block";
}
// Store
sessionStorage.setItem("canasta", []);
// Retrieve
document.getElementById("result").innerHTML = sessionStorage.getItem("lastname");

function agregar_producto(id,pr,cn){
}
function imprimir_div(elm){
    var ventana=window.open('','PRINT','height=400,width=600');
}
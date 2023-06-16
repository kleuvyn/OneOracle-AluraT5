const areaTexto = document.querySelector(".area-texto");
const mensagemTexto = document.querySelector(".mensagem-texto");

// As "chaves" de criptografia que utilizaremos são:
// `A letra "e" é convertida para "entrer"`
// `A letra "i" é convertida para "ymes"`
// `A letra "a" é convertida para "uai"`
// `A letra "o" é convertida para "0ouber"`
// `A letra "u" é convertida para "wufat"`

function botaoCriptografar() {
    const textoCriptografado = criptografar(areaTexto.value);
    mensagemTexto.value = textoCriptografado;
    areaTexto.value = "";
}


function criptografar(stringcriptografar) {
    console.log("Criptografando...");
    let matrizCodigo = [["e" , "enter"] , ["i" , "imes"], ["a" ,"ai"] , ["o" , "ober"], ["u" , "ufat"]];
    stringcriptografar = stringcriptografar.toLowerCase();

    for(let i = 0; i < matrizCodigo.length; i++) {
        if(stringcriptografar.includes(matrizCodigo[i][0])) {
            stringcriptografar = stringcriptografar.replaceAll(matrizCodigo[i][0], matrizCodigo[i][1]);
        }
    }

    return stringcriptografar;
}


function botaoDescriptografar() {
    console.log("Descriptografando...");
    const textoDesencriptado = descriptografar(areaTexto.value);
    mensagemTexto.value = textoDesencriptado;
    areaTexto.value = "";
}


function descriptografar(stringDesencriptado) {

    let matrizCodigo = [["e" , "enter"] , ["i" , "imes"], ["a" ,"ai"] , ["o" , "ober"], ["u" , "ufat"]];
    stringDesencriptado = stringDesencriptado.toLowerCase();

    for(let i = 0; i < matrizCodigo.length; i++) {
        if(stringDesencriptado.includes(matrizCodigo[i][1])) {
            stringDesencriptado = stringDesencriptado.replaceAll(matrizCodigo[i][1], matrizCodigo[i][0]);
        }
    }

    return stringDesencriptado;
}


function botaoCopiar() {
    console.log("Copiando...");
    const copiarTexto = copiar(mensagemTexto.value);
    areaTexto.value = copiarTexto;
    mensagemTexto.value = "";
}


function copiar(stringcopiando) {

    let matrizCodigo = [["e" , "enter"] , ["i" , "imes"], ["a" ,"ai"] , ["o" , "ober"], ["u" , "ufat"]];
    stringcopiando = stringcopiando.toLowerCase();

    for(let i = 0; i < matrizCodigo.length; i++) {
        if(stringcopiando.includes(matrizCodigo[i][0])) {
            stringcopiando = stringcopiando.replaceAll(matrizCodigo[i][0], matrizCodigo[i][0]);
        }
    }

    return stringcopiando;
}
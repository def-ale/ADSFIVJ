import Arvore from "./Arvore.js";
import No from "./No.js";

let arvoreBST = new Arvore(100);

arvoreBST.inserir(50);
arvoreBST.inserir(230);
arvoreBST.inserir(30);
arvoreBST.inserir(70);
arvoreBST.inserir(140);
arvoreBST.inserir(115);
arvoreBST.inserir(190);
arvoreBST.inserir(40);
arvoreBST.inserir(20);
arvoreBST.inserir(15);
arvoreBST.inserir(350);
arvoreBST.inserir(101);

console.log(arvoreBST.buscar(23));
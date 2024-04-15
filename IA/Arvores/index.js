import No from "./No.js";
import ArvoreBinaria from "./ArvoreBinaria.js";

let arvoreB = new ArvoreBinaria();

arvoreB.inserir(5);
arvoreB.inserir(3);
arvoreB.inserir(7);
arvoreB.inserir(1);
arvoreB.inserir(4);
arvoreB.inserir(6);
arvoreB.inserir(8);

console.log("Árvore pré-ordem");
arvoreB.vlr();

/*
console.log("Árvore em Ordem: ");
arvoreB.lvr();
*/

/*
console.log("Árvore pós-ordem: ");
arvoreB.lrv();
*/


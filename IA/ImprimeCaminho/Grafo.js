import Rastreador from "./Rastreador.js";

export default class Grafo{
    inicio = null;
    meta = null;

    constructor(inicio, meta){
        this.inicio = inicio;
        this.meta = meta;
    }

    buscaMelhorEscolha() {
        let fila = []; // Array de rasteadores que vão indicar o caminho
        let ordenados = []; // Array de vértices adjacentes ordenados pela heurística getOrdenados();
        let atual; // Rastreador atual

        fila.push(new Rastreador(this.inicio, null));

        while (fila.length > 0) {
            atual = fila.shift();
            if (atual.vertice == this.meta) {
                return atual;
            }

            else {
                ordenados = atual.vertice.getOrdenados();
                ordenados.forEach(adjacente => {
                    fila.push(new Rastreador(adjacente, atual));
                });
            }

        }
        return null;  //retorna null ao não encontrar mais um caminho ligado a origem e destino
    }
}
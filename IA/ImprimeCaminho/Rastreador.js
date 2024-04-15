export default class Rastreador {
    vertice = null;
    anterior = null;
    pesoTotal = 0;

    constructor(vertice, anterior, pesoTotal = 0) {
        this.vertice = vertice;
        this.anterior = anterior;
        this.pesoTotal = pesoTotal;
    }

    imprimeCaminho() {
        let atual = this;
        let saida = "";
         
        saida += atual.vertice.valor;  

        while (atual.anterior != null) {

            atual = atual.anterior;

            saida = atual.vertice.valor + " --> " + saida;              
        }

        console.log("\n" + saida);
        console.log("Peso total: " + this.calcularPesoTotal() + "\n");
    }

    calcularPesoTotal() {
        let atual = this;
        let pesoTotal = 0;
    
        while (atual.anterior != null) {
            let arestas = atual.anterior.vertice.adjacentes; // Acessando as arestas do vértice anterior
            arestas.forEach(aresta => {
                if (aresta.destino === atual.vertice) {
                    pesoTotal += aresta.peso;
                }
            });
    
            atual = atual.anterior;
        }
    
        return pesoTotal;
    }
}   
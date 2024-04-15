import No from "./No.js";

class ArvoreBinaria {
    constructor(){
        this.raiz = null;
    }

    inserir(valor){
        const novoNo = new No(valor);

        if (!this.raiz) {
            this.raiz = novoNo;
            return;
        }

        let noAtual = this.raiz;

        while(noAtual) {
            if (valor < noAtual.valor) {
                if (!noAtual.esquerda) {
                    noAtual.esquerda = novoNo;
                    break;
                }
                noAtual = noAtual.esquerda;
            } else if (valor > noAtual.valor) {
                if (!noAtual.direita) {
                    noAtual.direita = novoNo;
                    break;
                }
                noAtual = noAtual.direita;
            } else {
                // Se o valor já existe, podemos decidir o que fazer (ignorar, substituir, etc.)
                // Nesse caso, apenas ignorei
                break;
            }
            
        } 
    }

    // em ordem ;; in-order ;; LVR
    lvr() {
        const pilha = [];
        let noAtual = this.raiz;

        while (noAtual || pilha.length > 0) {
            while (noAtual) {
                pilha.push(noAtual);
                noAtual = noAtual.esquerda;
            }

            noAtual = pilha.pop();
            console.log(noAtual.valor);

            noAtual = noAtual.direita;
        }
    }

    // pos-ordem ;; LRV
    lrv() {
        const resultado = [];
        const pilha = [];
        let atual = this.raiz;

        while (atual || pilha.length > 0) {
            if (atual) {
                resultado.push(atual.valor);
                pilha.push(atual);
                atual = atual.direita;
            } else { 
                atual = pilha.pop();
                atual = atual.esquerda;
            }
        }

        while (resultado.length > 0) {
            console.log(resultado.pop());
        }
    }

    // pre-ordem ;; VLR
    vlr() {
        if (!this.raiz) {
            return;
        }

        const pilha = [];
        pilha.push(this.raiz);

        while (pilha.length > 0) {
            const atual = pilha.pop();
            console.log(atual.valor);
        

            if (atual.direita) {
                pilha.push(atual.direita);
            }

            if (atual.esquerda) {
                pilha.push(atual.esquerda);
            }
        }
    }
}

export default ArvoreBinaria;
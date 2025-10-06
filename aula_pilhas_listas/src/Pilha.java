public class Pilha {
    private int[] elementos;   
    private int topo;          

    
    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1; 
    }

    
    public void push(int valor) {
        if (topo == elementos.length - 1) {
            System.out.println("Pilha cheia");
        } else {
            elementos[++topo] = valor;
        }
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return -1; 
        } else {
            return elementos[topo--];
        }
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    
    public boolean isEmpty() {
        return topo == -1;
    }
}


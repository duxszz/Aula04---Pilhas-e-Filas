public class App {
    public static void main(String[] args) {
        
    
    //1) Um aplicativo de edição de texto permite que o usuário use a função
    //"Desfazer" (Ctrl+Z). Cada ação realizada pelo usuário precisa ser
    //desfeita na ordem inversa em que aconteceu.
    //Qual estrutura de dados é mais adequada para essa situação: fila ou
    //pilha? Explique.
    //R: Pilha, porque toda vez que o usuario faz uma acao, ela é empilhada no topo
    //   e quando vai dar o control + z o sistema desempilha a ultima acao
    
    //2) Um hospital precisa organizar os exames realizados em pacientes
    //durante o dia. Cada exame é registrado em ordem cronológica. No fim
    //do dia, o sistema deve imprimir esses exames na ordem inversa à que
    //foram feitos (do último para o primeiro).
    //Que estrutura você usaria para guardar os exames: fila ou pilha?
    //Implementaria com array ou lista encadeada? Justifique.
    //R: Pilha, pois como no final teriamos que imprimir ao inverso, a pilha tendo a seguinte
    //   funcao de ultimo a entrar e primeiro a sair, ficaria melhor. Eu implementaria com uma
    //   lista encadeada pois nao saberia quantos exames teriam no dia e colocando tudo em uma lista só
    
    //3) Um sistema precisa controlar tarefas usando simultaneamente uma fila e uma pilha.
    //As tarefas chegam e são inseridas na fila, mas algumas tarefas prioritárias precisam
    //ser movidas imediatamente para a pilha, sendo resolvidas antes das demais.
    //Explique qual será a ordem final de execução das tarefas e justifique o porquê,
    //considerando o funcionamento das duas estruturas.
    //R: Seria uma fila comum mas tendo uma leve alteracao quando se tem uma prioridade, quando tiver é tirado dessa fila
    //   e colocada em uma pilha para ser atendido o mais rapido possivel logo sendo atendido, voltaria seguindo a fila

    //4) Implemente uma classe Pilha em Java que utilize arrays para
    //armazenar inteiros. Sua classe deve possuir:
    //1.Um construtor que receba a capacidade máxima da pilha.
    //2.O método push(int valor) para inserir um elemento no topo.
    //3.O método pop() para remover e retornar o elemento do topo.
    //4.O método peek() para consultar o elemento no topo sem removê-lo.
    //5.O método isEmpty() que retorna true se a pilha estiver vazia.
    //No método main, crie uma pilha de tamanho 5, insira três valores,
    //exiba o elemento do topo, e depois remova todos os elementos
    //mostrando a saída no console.
        Pilha pilha = new Pilha(5); 

        
            pilha.push(10);
            pilha.push(20);
            pilha.push(30);

        
            System.out.println("Topo da pilha: " + pilha.peek());

            System.out.println("Removido da pilha: " + pilha.pop());
            System.out.println("Removido da pilha: " + pilha.pop());
            System.out.println("Removido da pilha: " + pilha.pop());

             System.out.println( pilha.peek());

    System.out.println("-----------------------");
    //5) Implemente uma classe Fila em Java que utilize arrays para armazenar
    //inteiros. Sua classe deve possuir:
    //1.Um construtor que receba a capacidade máxima da fila.
    //2.O método enqueue(int valor) para inserir um elemento no final da fila.
    //3.O método dequeue() para remover e retornar o elemento do início da fila.
    //4.O método peek() para consultar o primeiro elemento sem removê-lo.
    //5.O método isEmpty() que retorna true se a fila estiver vazia.
    //No método main, crie uma fila de tamanho 5, insira três valores, exiba o
    //primeiro elemento, e depois remova todos os elementos mostrando a saída
    //no console. 
        
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);

        
        System.out.println("Primeiro elemento da fila: " + fila.peek());

        System.out.println("Removido da fila: " + fila.dequeue());
        System.out.println("Removido da fila: " + fila.dequeue());
        System.out.println("Removido da fila: " + fila.dequeue());
        
        System.out.println(fila.peek());
    
    }
}


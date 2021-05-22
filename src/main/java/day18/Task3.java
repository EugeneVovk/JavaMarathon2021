package day18;

/**
 * Реализовать двоичное дерево
 * Затем необходимо с помощью алгоритма поиска в глубину пройтись по этому двоичному дереву
 * и вывести эл-ты этого дерева в возрастающем порядке
 */

public class Task3 {
    public static void main(String[] args) {

        //  двоичное дерево задаётся своим корнем
        Node root = new Node(20);

        int[] numbers = {14, 23, 11, 16, 22, 27, 5, 15, 18, 24, 150, 8};
        //  чтобы создать двоичное дерево будем проходиться по массиву numbers
        //  для кадого числа этого массива будет вызывать метод addNode();
        for (int number : numbers)
            addNode(number, root);

        //  с помощью рекурсивного алгоритма поиска в глубину(обхода в глубину) - Depth-first search - DFS
        //  мы должны обойти это двоичное дерево и вывести значения из этого дерева в возрастающем порядке
        //  Двоичное дерево - это рекурсивная структура данных (узел указывает на узел)
        dfs(root);

    }

    private static void dfs(Node node) {
        //  делаем базу рекурсии (то условие при котором заканчиваются рекурсивные вызовы)
        if (node == null)
            return;

        dfs(node.getLeft());
        System.out.print(node.getValue() + " ");
        dfs(node.getRight());
    }

    private static void addNode(int insertValue, Node root) {
        //  когда мы принимаем значение, мы имеем корень,
        //  мы должны идти вниз до тех про пока не найдём то место, куда мы должны вставить наше число
        if (root == null)
            throw new IllegalArgumentException("Корневой узел должен быть не null");
        Node nextNode = root;
        Node current = null;

        //  создаём цикл, к-й будет идти в глубь двоичного дерева и будет находить то место, куда вставить insertValue
        while (nextNode != null) {
            //  nextNode всегда укадывает на следующий узел,
            //  когда nextNode = 0, это означает, что мы нах-ся на листе нашего дерева
            current = nextNode;

            //  ветки
            if (insertValue < current.getValue())
                nextNode = current.getLeft();
            else
                nextNode = current.getRight();

        }
        //  находимся на листочке нашего дерева, вставляем новый узел куда это необходимо
        if (insertValue < current.getValue())
            current.setLeft(new Node(insertValue));
        else
            current.setRight(new Node(insertValue));
    }
}

class Node {
    private int value;
    private Node left;  //  по умолчанию null у созданного объекта
    private Node right; //  по умолчанию null у созданного объекта

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
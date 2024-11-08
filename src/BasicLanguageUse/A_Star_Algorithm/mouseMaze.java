package BasicLanguageUse.A_Star_Algorithm;

import java.util.*;

class Node implements Comparable<Node> {
    int row, col;
    int gCost, hCost, fCost;

    Node parent;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void calculateCosts(Node endNode) {
        // gCost 是从起点到该节点的实际距离
        // hCost 是该节点到终点的估计距离（曼哈顿距离）
        hCost = Math.abs(endNode.row - row) + Math.abs(endNode.col - col);
        if (parent != null) {
            gCost = parent.gCost + 1;  // 每次移动的代价为1
        }
        fCost = gCost + hCost;
    }

    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.fCost, other.fCost);
    }
}

public class mouseMaze {

    public static int[][] grid = new int[][]{
            {0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 0, 1, 1, 0},
            {0, 0, 0, 0, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0},
    };

    public static List<Node> findPath(int startRow, int startCol, int endRow, int endCol) {
        PriorityQueue<Node> openList = new PriorityQueue<>();
        Set<Node> closedList = new HashSet<>();

        Node startNode = new Node(startRow, startCol);
        Node endNode = new Node(endRow, endCol);

        startNode.calculateCosts(endNode);
        openList.add(startNode);

        while (!openList.isEmpty()) {
            Node currentNode = openList.poll();
            closedList.add(currentNode);

            // 找到终点
            if (currentNode.row == endRow && currentNode.col == endCol) {
                return reconstructPath(currentNode);
            }

            // 检查邻居节点（上下左右）
            for (Node neighbor : getNeighbors(currentNode)) {
                if (closedList.contains(neighbor) || grid[neighbor.row][neighbor.col] == 0) {
                    continue;  // 跳过已经处理的节点或墙壁
                }

                neighbor.parent = currentNode;
                neighbor.calculateCosts(endNode);

                if (!openList.contains(neighbor)) {
                    openList.add(neighbor);
                }
            }
        }

        return Collections.emptyList();  // 如果没有找到路径，返回空列表
    }

    private static List<Node> getNeighbors(Node node) {
        List<Node> neighbors = new ArrayList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};  // 上下左右
        for (int[] direction : directions) {
            int newRow = node.row + direction[0];
            int newCol = node.col + direction[1];
            if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
                neighbors.add(new Node(newRow, newCol));
            }
        }
        return neighbors;
    }

    private static List<Node> reconstructPath(Node currentNode) {
        List<Node> path = new ArrayList<>();
        while (currentNode != null) {
            path.add(currentNode);
            grid[currentNode.row][currentNode.col] = 2;  // 将路径标记为2
            currentNode = currentNode.parent;
        }
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        List<Node> path = findPath(1, 1, 6, 5);
        if (path.isEmpty()) {
            System.out.println("没有找到路径");
        } else {
            for (Node node : path) {
                System.out.println("[" + node.row + ", " + node.col + "]");
            }

            // 打印迷宫和路径
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 7; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    class car {
        // field 成员变量、属性、字段
        // public 是访问修饰符（Access Modifiers）、属性类型、属性名，用来控制属性的访问范围
        // 访问修饰符（Access Modifiers）有四种：
        // public：公共的，表示可以从任何地方访问。
        // private：私有的，仅在同一个类中可访问。
        // protected：受保护的，可以在同一个包以及子类中访问。
        // default（package-private）就是默认：没有显式声明修饰符时的默认访问级别，仅在同一个包中可访问。
        public String name;
        double price;
        String color;
    }
}

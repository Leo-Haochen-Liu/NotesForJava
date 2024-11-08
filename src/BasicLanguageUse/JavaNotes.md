

Basic Data Types 基本数据类型
`int`, `float`, `double`, `boolean`; `String` 不是基本数据类型，它存储的是地址

### 1.1. Converting `int`, `float`, `double`, `boolean` to `String`: both `x + ""` and `Integer.toString(int)` work:

    int x1;
    float x2;
    double x3;
    boolean x4;

    String y1 = x1 + "";
    String y2 = x2 + "";
    String y3 = x3 + "";
    String y4 = x4 + "";

    String z1 = Integer.toString(x1);
    String z2 = Float.toString(x2);
    String z3 = Double.toString(x3);
    String z4 = Boolean.toString(x4);

### 1.2. Converting `String` to `int`, `float`, `double`, `boolean`: `Integer.parseInt(string)`

    String y1 = "10";
    String y2 = "10.1";
    String y3 = "10.1";
    String y4 = "true";

    int X1 = Integer.parseInt(y1);
    float X2 = Float.parseFloat(y2);
    double X3 = Double.parseDouble(y3);
    boolean X4 = Boolean.parseBoolean(y4);

### 1.3. Get a char from`String`: `.charAt(index)`

    String y = "123";
    System.out.println(y.charAt(0));

### Arithmetic Operators 算术运算符 `++`

    int j = 1;
    i = j++; // i = 1
    i = ++j; // i = 2, j = 2

### Calculating

    double a = 5 / 9; // a = 0.0
    double b = 5.0 / 9; // b = 0.5555555555555556
    double c = 5 / 9.0; //c = 0.5555555555555556

### Ternary Operator 三元运算/三目运算

    int a = 10, b = 20;
    int max = (a > b) ? a : b;  // max = 20

this is a simplified version of `if-else`

    int a = 10, b = 20, max;
    if (a > b) max = a;
    else max = b;
    System.out.println(max);

### `&` bitwise AND 按位与运算符

逐一比较二进制下的每一位数，如果相同则该位返回1

    int a = 7; // 111
    int b = 5; // 101
    int result = a & b; // 101
    System.out.println(result);
    a = 5; // 101
    b = 3; // 011
    result = a & b; // 1
    System.out.println(result);
    
### `Scanner` Get User Input 键盘输入

first input 'java.util.Scanner'

    import java.util.Scanner;

then create `Scanner` object and get user input

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("please input a integer：");
        int num = scanner.nextInt();
        System.out.println("the integer you input is：" + num);

        scanner.close();
    }

### Define A Label `outerLoop:`

    StringBuilder result = new StringBuilder();

    // find the length of the String array

    int stringLength = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
        stringLength = (strs[i].length() < stringLength) ? strs[i].length() : stringLength;
    }

    // compare if the characters in every String is the same

    outerLoop:  // define a label
    for (int i = 0; i < stringLength; i++) {
        for (int j = 0; j < strs.length - 1; j++) {
            if (strs[j].charAt(i) != strs[j + 1].charAt(i)) break outerLoop;  // break out the entire loop
        }
        result.append(strs[0].charAt(i));
    }
    return result.toString();

which is the same as:

    StringBuilder result = new StringBuilder();

    // find the length of the String array

    int stringLength = strs[0].length();
    for (int i = 1; i < strs.length; i++) {
        stringLength = (strs[i].length() < stringLength) ? strs[i].length() : stringLength;
    }

    // compare if the characters in every String is the same
        
    for (int i = 0; i < stringLength; i++) {
        for (int j = 0; j < strs.length - 1; j++) {
            if (strs[j].charAt(i) != strs[j + 1].charAt(i)) return result.toString();
        }
        result.append(strs[0].charAt(i));
    }
    return result.toString();

### Two-Dimensional Array 二维数组

    int[] x = new int[1], y[] = new int[1][1];
    x[0] = y[0][0];

### field 成员变量、属性、字段

    class car {
        String name;
        double price;
        String color;
    }

### Access Modifiers 访问修饰符

public 是访问修饰符（Access Modifiers）、属性类型、属性名，用来控制属性的访问范围

访问修饰符（Access Modifiers）有四种：

public：公共的，表示可以从任何地方访问。

private：私有的，仅在同一个类中可访问。

protected：受保护的，可以在同一个包以及子类中访问。

default（package-private）就是默认：没有显式声明修饰符时的默认访问级别，仅在同一个包中可访问。

    class car {
        public String name;
        private double price;
        protected String color;
    }

### ArrayList

    ArrayList<Integer> arrList = new ArrayList<Integer>();
    arrList.add(0, 10);
    System.out.println(arrList.get(0));
    System.out.println(arrList.size());

how to set up a `List<List<Integer>>` quickly:

    List<List<Integer>> result = new ArrayList<>();
    result.add(0, new ArrayList<>(Arrays.asList(1)));

### HashMap

    Map<String, Integer> map1 = new HashMap<>();
    map1.put("HD", 80);
    System.out.println(map1.get("HD"));
    // "HD" here is key, and 80 is the value
    // the map is designed to retrieve values using keys

set up a new HashMap:

    Map<Character, Integer> toIntMap = new HashMap<>(Map.of(
        'I', 1, 
        'V', 5, 
        'X', 10, 
        'L', 50, 
        'C', 100, 
        'D', 500, 
        'M', 1000));
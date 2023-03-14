class Main {
  public static void main(String[] args) {
    int[][] intArray = new int[][]{{555, 111}, {2016, 336}, {3096, 387}, {1498, 214}, {405, 45}};
    double total = 0;
    double div = 0;
    double print = 0;
    for(int i = 0; i < intArray.length; i++){
        total += intArray[i][0];
        div += intArray[i][1];
        print = total / div;
        System.out.println(print);
    }
  }
}

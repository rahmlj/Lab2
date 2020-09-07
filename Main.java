class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    double totalM = 55 * 10;

    double blueM = totalM * .24;
    int blueMNumber = (int)Math.round(blueM);
    double brownM = totalM * .13;
    int brownMNumber = (int)Math.round(brownM);
    double greenM = totalM * .16;
    int greenMNumber = (int)Math.round(greenM);
    double orangeM = totalM * .20;
    int orangeMNumber = (int)Math.round(orangeM);
    double redM = totalM * .13;
    int redMNumber = (int)Math.round(redM);
    double yellowM = totalM * .14;
    int yellowMNumber = (int)Math.round(yellowM);

    double sumM = blueM + brownM + greenM + orangeM + redM + yellowM;
    int sumMNumber = (int)Math.round(sumM);

    System.out.println("Blue: " + blueMNumber);
    System.out.println("Brown: " + brownMNumber);
    System.out.println("Green: " + greenMNumber);
    System.out.println("Orange " + orangeMNumber);
    System.out.println("Red: " + redMNumber);
    System.out.println("Yellow: " + yellowMNumber);

    System.out.println("Sum of M&Ms:" + sumMNumber);

    if ( blueMNumber > brownMNumber && greenMNumber > orangeMNumber)
     System.out.println("Blue over Brown and Green over Orange");
    if ( brownMNumber <= redMNumber)
     System.out.println("Brown is less than or equal to Red");
    if ( sumMNumber == totalM)
     System.out.println("Numbers match");


  }
}
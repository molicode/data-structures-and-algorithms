package skills.certification.test.how_will_you_compare;

public class BitPuzzle {

  public static void main(String[] args) {
    int mask = 0x000f;
    int value = 0x2222;

    System.out.println("Deicmal of " + mask +" is: " + Integer.parseInt(String.valueOf(mask), 16));
    System.out.println("Deicmal of " + value +" is: " + Integer.parseInt(String.valueOf(value), 16));

    System.out.println("Resultado de la operacion AND bit a bit: " + (value & mask));
  }

}

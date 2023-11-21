class _3_CopyArray {
  public static void main(String[] args) {

    // define the source array holding the elements to be transferred later
    int[] sourceEssence = {1, 2, 3, 4, 5};

    // define the destination array where the essence will be transferred to, later
    int[] destinationEssence = new int[sourceEssence.length]; // Preparing the vessel for the essence

    
    // see the elements the source array before the transfer begins, using a 'for' loop
    System.out.println("Source Essence:");
    for (int essence : sourceEssence) {
      System.out.print(essence + " "); // displaying the essence of the source
    }// end FOR
    System.out.println();

  }// end method
}// end class

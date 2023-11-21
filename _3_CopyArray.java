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

    // call 'transferEssence' method to transfer the elements from source to destination array, taking both arrays as arguments
    transferEssence(sourceEssence, destinationEssence);

  }// end method


  // define a method to transfer elements from one array to another
  public static void transferEssence(int[] origin, int[] destination) {
    // Ensure the arrays' lengths align for a successful transfer
    if (origin.length != destination.length) {
      System.out.println("Alas! The arrays' lengths do not align. The transfer fails.");
      return; // Exit the ritual if the lengths mismatch
    }

    // Perform the transfer of essence from the origin to the destination array
    for (int i = 0; i < origin.length; i++) {
      destination[i] = origin[i]; // Channeling the elements from one array to another
    }
  }// end 'transferEssence' method
  
}// end class

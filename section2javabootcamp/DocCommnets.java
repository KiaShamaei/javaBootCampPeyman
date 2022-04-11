public class DocCommnets {

    public static void main(String[] args) {
        DocCommnets docCommnets = new DocCommnets();
        System.out.println( docCommnets.calcArea(4.300, 5.55));

        
    }


    /**
     * Function name calcArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     */
    public double calcArea(double length , double width){
        return length * width;
    }
    
}

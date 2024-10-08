public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }
    public String toString(){
        String result = "";
        for (int i = 0; i < width + 1; i++){
            result += "[*]".repeat(i) + "\n";
        }
        return result;
    }

}

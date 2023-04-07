public class FloodFill {
    public int[][] fill(int[][] image, int r, int c, int color, int org, int rows, int cols){
        if(r<0 || c<0 || r==rows || c==cols || image[r][c]!=org)
        {
            return image;
        }
        image[r][c] = color;
        image = fill(image, r-1, c, color, org, rows,cols);
        image = fill(image, r, c-1, color, org, rows,cols);
        image = fill(image, r+1, c, color, org, rows,cols);
        image = fill(image, r, c+1, color, org, rows,cols);
        return image;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color)
            return image;
        int org = image[sr][sc];
        return fill(image,sr,sc,color,org,image.length,image[0].length);
    }
}

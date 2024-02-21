ppublic class pertemuanLimaSoal {
    public static void main(String[] args){

        int x=10, y=6, z=25;
        x *= 5+y;
        y += y &= x;
        z += x>>2 & y<<1;
        System.out.printf("x = %d\ny = %d\nz = %d\n",x,y,z);

    }
}
public class CarParking
{
    private int[] a;
    private String[] carNo;
    private String[] color;

    public int[] getA() {
        return a;
    }

    public String[] getCarNo() {
        return carNo;
    }

    public String[] getColor() {
        return color;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void setCarNo(String[] carNo) {
        this.carNo = carNo;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void removeSlot(int b)
    {
        a[b]=0;
        carNo[b]="NULL";
        color[b]="NULL";

    }
    public int[] remainingSlot(int n,int[] r)
    {
        for(int h=0,g=0;h<n;h++)
        {
            if(a[h]==0)
            {
                r[g]=h;
                g++;
            }
        }
        return r;
    }
    //public void detail(int[] a,String[] carNo,String[] color )
    {

    }




}


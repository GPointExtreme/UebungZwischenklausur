public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data1 = new int[3];
        data1[0] = 5;
        data1[1] = 20;
        data1[2] = 50;
        
        int[] data2 = new int[3];
        data2[0] = 5;
        data2[1] = 5;
        data2[2] = 50;

        //System.out.println(ArrayTools.avg(data1));
        
        //System.out.println(ArrayTools.countIf(data2, 5));
        
        System.out.println(ArrayTools.intersectCount(data1, data2));
        
        
        
		

		

	}

}
